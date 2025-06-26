package academy.devdojo.maratonajava.javacore.G_associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sou o grande software de previsão do futuro!!");
        System.out.println("Digite sua pergunta abaixo e eu responderei sim ou não");

        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == ' '){ // charAt retorna o caractere no índice especificado de uma string
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
