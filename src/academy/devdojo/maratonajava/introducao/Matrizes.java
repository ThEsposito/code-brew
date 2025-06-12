package academy.devdojo.maratonajava.introducao;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {// matriz[0].length n eh ideal. Cada lin ter umq qtde diferente de cols
                matriz[i][j] = j;
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("-------------------------");
        for(int[] linha: matriz){ // Agora usando o foreach
            for(int coluna:linha){
                System.out.println(coluna);
            }
        }
    }
}
