package academy.devdojo.maratonajava.javacore.O_exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);
        } catch (IOException e) {
            // A stackTrace mostra exatamente onde o erro/exceção ocorreu, mas não interrompe
            // o programa.
            e.printStackTrace();
            // NUNCA DEIXE O BLOCO CATCH EM BRANCO!!!
            // Evite colocar regra de negócio no catch!
        }
        System.out.println("Depois do bloco try");

    }
}
