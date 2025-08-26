package exercicios.compactacaoBMP;

import java.io.*;
import java.nio.file.Files;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Todo:
 - Otimizar a gravação dos arquivos: colocar tudo num buffer só, ao invés de fazer várias chamadas pro
   SO pra ele escrever pequenas partes. Melhor escrever tudo de uma vez.
 - Tem algum bug na descompactação que, às vezes, trava a execução da função e não exibe nenhuma das
   mensagens até apertar alguma tecla dnv. o tempo de execução da func recursiva aparece como 0.
 - Consertar estouro de memória na linha 214
*/
public class Main {
    public static void main(String[] args) {
        String originalPath = "src/exercicios/compactacaoBMP/imagens/imagem_teste_48mb.bmp";
        String nomeOriginal = originalPath.substring(originalPath.lastIndexOf('/')+1, originalPath. lastIndexOf('.'));

        File imagemOriginal = new File(originalPath);
        File imagemCompactada = new File("src/exercicios/compactacaoBMP/resultados/"+nomeOriginal+"_compactada.zmp");
        File imagemDescompactada = new File("src/exercicios/compactacaoBMP/resultados/"+nomeOriginal+"_descompactada.bmp");

        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("  1. Compactar Imagem");
            System.out.println("  2. Descompactar Imagem");
            System.out.println("  3. Sair");
            System.out.print("  Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    Instant liCompac = Instant.now();
                    Compactador.compactarImagem(imagemOriginal, imagemCompactada);
                    Instant lfCompac = Instant.now();
                    Duration tExecCompac = Duration.between(liCompac,lfCompac);
                    System.out.println("Tempo de execução total do compactador: "+ tExecCompac.toMillis() +" ms, ou "+tExecCompac.toSeconds()+ 's');
                    break;
                case 2:
                    Instant liDescompac = Instant.now();
                    Compactador.descompactarImagem(imagemCompactada, imagemDescompactada);
                    Instant lfDescompac = Instant.now();
                    Duration tExecDescompac = Duration.between(liDescompac,lfDescompac);
                    System.out.println("Tempo de execução total do descompactador: "+tExecDescompac.toMillis()+" ms, ou "+tExecDescompac.toSeconds()+'s');

                    break;
                case 3:
                    System.out.print("Até mais!\n");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 3);

        long tamArquivoOriginal = imagemOriginal.length();
        long tamArquivoCompactado = imagemCompactada.length();
        long tamArquivoDescompactado = imagemDescompactada.length();

//        System.out.println("\nResolução da imagem: "+ );
        System.out.println("Tamanho da imagem Original: "+ tamArquivoOriginal + " bytes");
        System.out.println("Tamanho da imagem Compactada: " + tamArquivoCompactado + " bytes");
        System.out.println("Tamanho da imagem Remontada: " + tamArquivoDescompactado + " bytes");

        int porcentagemCompactacao = (int)(((float)(tamArquivoOriginal - tamArquivoCompactado) / tamArquivoOriginal) * 100);
        System.out.println("Porcentagem de compactação: " + porcentagemCompactacao + '%');

    }
}

class Compactador{
    public static void compactarImagem(File entrada, File saida){
        byte[] imagemOriginalComCabecalho;
        try {
            imagemOriginalComCabecalho = Files.readAllBytes(entrada.toPath());
        } catch(IOException e) {
            System.out.println("Erro na leitura da imagem original! Confira se o caminho incluído está correto!");
            return;
        }
        // Aparentemente, o offset é baseado em 4bytes, e não dois. O sinal (MSB) estava inferferindo!
//        int offset = (imagemOriginalComCabecalho[11]<<8) + imagemOriginalComCabecalho[10];
        int offset = imagemOriginalComCabecalho[13] << 24 + imagemOriginalComCabecalho[12] << 16 + imagemOriginalComCabecalho[11] << 8 + imagemOriginalComCabecalho[10];

        int colunas_pixels = (imagemOriginalComCabecalho[21]<<24) + (imagemOriginalComCabecalho[20]<<16) + (imagemOriginalComCabecalho[19]<<8) + imagemOriginalComCabecalho[18];
        int linhas_pixels = (imagemOriginalComCabecalho[25]<<24) + (imagemOriginalComCabecalho[24]<<16) + (imagemOriginalComCabecalho[23]<<8) + imagemOriginalComCabecalho[22];

        int colunas = colunas_pixels*3;
        int zeros_por_linha = (4-(colunas%4))%4;

        byte[] cabecalho = Arrays.copyOfRange(imagemOriginalComCabecalho, 0, offset);

        byte[][] matriz_imagem_original = new byte[linhas_pixels][colunas];
        int idx = offset;

        for(int i=0; i<linhas_pixels; i++){
            for(int j=0; j<colunas; j++){
                matriz_imagem_original[i][j] = imagemOriginalComCabecalho[idx];
                idx++;
            }
            idx+=zeros_por_linha;
        }

        // TODO: pode ser interessante encontrar uma forma de implementar com arrays para diminuir o tempo de execução
        ArrayIndex indice_vetores = new ArrayIndex();
        ArrayList<Byte> R = new ArrayList<>();
        ArrayList<Byte> G = new ArrayList<>();
        ArrayList<Byte> B = new ArrayList<>();

        try{
            saida.createNewFile();
        } catch (IOException e){
            System.out.println("Uma imagem compactada já existe no caminho especificado!");
            return;
        }
        // Medindo tempo de execução do algoritmo recursivo utilizado:
        System.out.println("Compactando...");
        Instant tempoInicial = Instant.now();
        compactaBMP(linhas_pixels, colunas_pixels, zeros_por_linha, matriz_imagem_original, 0, linhas_pixels-1, 0, colunas_pixels-1, R, G, B, indice_vetores);
        Instant tempoFinal = Instant.now();


        FileOutputStream writer = null;
        try {
            writer = new FileOutputStream(saida);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de saída não encontrado (criação do writer)");
            return;
        } catch (SecurityException e) {
            System.out.println("Erro nas config de segurança do arquivo");
            return;
        } catch (Exception e){
            System.out.println("Erro não esperado na criação do writer do compactador");
            return;
        }

        // TODO: O processo de gravação, aparentemente, tá demorando demais!
        System.out.println("Gravando arquivo...");
        Instant inicioGrav = Instant.now();
        for(int i=0; i<offset; i++){
            try {
                writer.write(cabecalho[i]);
            } catch (IOException e){
                System.out.println("Erro ao escrever no arquivo de saída");
            }
        }

        for (int i = 0; i < indice_vetores.valor; i++) {
            try {
                writer.write(R.get(i));
                writer.write(G.get(i));
                writer.write(B.get(i));
            } catch (IOException e) {
                System.out.println("Erro na gravação da imagem em si (vetores R, G e B)");
                return;
            } catch (NullPointerException e){
                System.out.println("ArrayList's (R, G e B) podem ter sido inicializados como nulos");
                return;
            }
        }
        Instant finalGrav = Instant.now();
        System.out.println("Imagem compactada com sucesso!");
        System.out.println("Tempo de execução do algoritmo de compactação: " + Duration.between(tempoInicial, tempoFinal).toSeconds() + " segundos");
        System.out.println("Tempo de gravação do arquivo: " + Duration.between(inicioGrav, finalGrav).toSeconds() + " segundos");

        try{
            writer.close();
        } catch (IOException e){
            System.out.println("Erro ao fechar writer.");
        }
    }

    public static void descompactarImagem(File compactada, File saida){
        if(compactada == null || compactada.length() == 0){
            System.out.println("Arquivo compactado inexistente ou vazio");
            return;
        }

        FileInputStream leitor;
        try {
            leitor = new FileInputStream(compactada);
        } catch(FileNotFoundException e) {
            System.out.println("Problema ao instanciar leitor de arquivo: Arquivo não encontrado.");
            return;
        } catch(SecurityException e){
            System.out.println("Problemas de segurança na imagem compactada.");
            return;
        } catch (Exception e) {
            System.out.println("Erro desconhecido ao instanciar leitor de arquivo?");
            return;
        }

        byte[] cabecalho;
        try {
            cabecalho = leitor.readNBytes(12);
            int offset = (cabecalho[11] << 8) + cabecalho[10];
            leitor = new FileInputStream(compactada);

            cabecalho = leitor.readNBytes(offset);
        } catch(IOException e){
            System.out.println("Erro na leitura do cabeçalho da imagem compactada");
            return;
        }
        int colunas_pixels = (cabecalho[21]<<24) + (cabecalho[20]<<16) + (cabecalho[19]<<8) + cabecalho[18];
        int linhas_pixels = (cabecalho[25]<<24) + (cabecalho[24]<<16) + (cabecalho[23]<<8) + cabecalho[22];

        int colunas = colunas_pixels*3;
        int zeros_por_linha = (4-(colunas%4))%4;

        // Essa linha está estourando a memória em alguns casos (resoluções mto altas?)
        byte[][] matriz_reconstruida = new byte[linhas_pixels][colunas + zeros_por_linha];

        ArrayIndex indice_vetores = new ArrayIndex();

        int tam = ((int) compactada.length() - cabecalho.length) / 3;
        byte[] R = new byte[tam];
        byte[] G = new byte[tam];
        byte[] B = new byte[tam];

        for(int i=0; i<tam; i++){
            byte[] pixelAtual;
            try {
                pixelAtual = leitor.readNBytes(3); // Estourou aqui
            }catch (IOException e) {
                System.out.println("Erro na leitura da imagem compactada");
                return;
            }

            R[indice_vetores.valor] = pixelAtual[0];
            G[indice_vetores.valor] = pixelAtual[1];
            B[indice_vetores.valor] = pixelAtual[2];
            indice_vetores.valor++;
        }

        indice_vetores.valor = 0;
        // Medindo tempo de execução do algoritmo recursivo utilizado:
        System.out.println("Descompactando...");
        Instant tempoInicial = Instant.now();
        descompactaBMP(linhas_pixels, colunas_pixels, zeros_por_linha, matriz_reconstruida, 0, linhas_pixels-1, 0, colunas_pixels-1,R,G,B,indice_vetores);
        Instant tempoFinal = Instant.now();


        FileOutputStream writer;
        try {
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao fechar leitor, no processo de compactação da imagem!");
        }
        try {
            writer = new FileOutputStream(saida);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de saída não encontrado (criação do writer)");
            return;
        } catch (SecurityException e) {
            System.out.println("Erro nas config de segurança do arquivo");
            return;
        }

        System.out.println("Gravando arquivo...");
        Instant inicioGrav = Instant.now();
        try {
            writer.write(cabecalho);
            for(int i=0; i < linhas_pixels; i++){
                writer.write(matriz_reconstruida[i]); //gravando de linha em linha
            }

        } catch(Exception e) {
            System.out.println("Erro na gravação da imagem descompactada");
            return;
        }
        Instant finalGrav = Instant.now();

        System.out.println("Imagem descompactada com sucesso!");
        System.out.println("Tempo de execução do algoritmo de descompactação: "+Duration.between(tempoInicial, tempoFinal).toSeconds() +" segundos");
        System.out.println("Tempo de gravação do arquivo descompactado: "+Duration.between(inicioGrav, finalGrav).toSeconds() +" segundos");
    }

    private static void compactaBMP(int linhas_matriz, int colunas_pixel, int zeros_por_linha, byte[][] matriz_imagem_original,
                                    int lin_inicial, int lin_final, int col_inicial, int col_final, List<Byte> R,
                                    List<Byte> G, List<Byte> B, ArrayIndex indice_vetores){
        int qtde_linhas_nessa_recursao = lin_final - lin_inicial + 1;
        int qtde_col_nessa_recursao = col_final - col_inicial + 1;

        if(qtde_linhas_nessa_recursao<=3 || qtde_col_nessa_recursao<=3){
            int centro_col = (col_final + col_inicial)/2;
            int centro_lin = (lin_final + lin_inicial)/2;
            int centro_col_byte = centro_col*3;

            R.add(matriz_imagem_original[centro_lin][centro_col_byte]);
            G.add(matriz_imagem_original[centro_lin][centro_col_byte+1]);
            B.add(matriz_imagem_original[centro_lin][centro_col_byte+2]);
            indice_vetores.valor++;
            return;
        }

        int meio_col = (col_final + col_inicial)/2;
        int meio_lin = (lin_final + lin_inicial)/2;

        compactaBMP(linhas_matriz, colunas_pixel,zeros_por_linha, matriz_imagem_original, lin_inicial, meio_lin, col_inicial, meio_col, R, G, B, indice_vetores);
        compactaBMP(linhas_matriz, colunas_pixel,zeros_por_linha, matriz_imagem_original, lin_inicial, meio_lin, meio_col+1, col_final, R, G, B, indice_vetores);
        compactaBMP(linhas_matriz, colunas_pixel,zeros_por_linha, matriz_imagem_original, meio_lin+1, lin_final, col_inicial, meio_col, R, G, B, indice_vetores);
        compactaBMP(linhas_matriz, colunas_pixel,zeros_por_linha, matriz_imagem_original, meio_lin+1, lin_final, meio_col+1, col_final, R, G, B, indice_vetores);
    }

    private static void descompactaBMP(int linhas, int colunas_pixel, int zeros_por_linha, byte[][] matriz_reconstruida,
                                int lin_inicial, int lin_final, int col_inicial, int col_final,
                                byte[] R, byte[] G, byte[] B, ArrayIndex indice_vetores){
        int qtde_linhas_nessa_recursao = lin_final - lin_inicial + 1;
        int qtde_col_nessa_recursao = col_final - col_inicial + 1;

        if(qtde_linhas_nessa_recursao<=3 || qtde_col_nessa_recursao<=3){
            for (int i = lin_inicial; i <= lin_final; i++) {
                for (int j = col_inicial; j <= col_final; j++) {
                    int col_byte = j * 3;
                    matriz_reconstruida[i][col_byte] = R[indice_vetores.valor];
                    matriz_reconstruida[i][col_byte + 1] = G[indice_vetores.valor];
                    matriz_reconstruida[i][col_byte + 2] = B[indice_vetores.valor];
                }
            }
            indice_vetores.valor++;
            return;
        }
        int meio_col = (col_final + col_inicial)/2;
        int meio_lin = (lin_final + lin_inicial)/2;

        descompactaBMP(linhas, colunas_pixel,zeros_por_linha, matriz_reconstruida, lin_inicial, meio_lin, col_inicial, meio_col, R, G, B, indice_vetores);
        descompactaBMP(linhas, colunas_pixel,zeros_por_linha, matriz_reconstruida, lin_inicial, meio_lin, meio_col+1, col_final, R, G, B, indice_vetores);
        descompactaBMP(linhas, colunas_pixel,zeros_por_linha, matriz_reconstruida, meio_lin+1, lin_final, col_inicial, meio_col, R, G, B, indice_vetores);
        descompactaBMP(linhas, colunas_pixel,zeros_por_linha, matriz_reconstruida, meio_lin+1, lin_final, meio_col+1, col_final, R, G, B, indice_vetores);

    }
}

// Criei essa classe só pra poder acessar "valor" (o índice propriamente dito) como referência. (Gambiarra monstra)
class ArrayIndex{
    public int valor = 0;
}
