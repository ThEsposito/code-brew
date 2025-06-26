package academy.devdojo.maratonajava.javacore.G_associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System é do pacote java.lang e in é um atributo da classe System (uma usa a outra)

        System.out.println("Digite o seu primeiro nome");
        String next = input.next();// Lê só a primeira palavra.
        // PORÉM, o restante (oq n foi lido) ainda continua no buffer, podendo impactar a próxima leitura
        System.out.println(next);

        System.out.println("Digite seu nome e sobrenome");
        String nextLine = input.nextLine();
        System.out.println(nextLine);

        System.out.println("Digite sua idade");
        int nextInt = input.nextInt();
        System.out.println(nextInt);

        System.out.println("Digite seu sexo");
        char caractere = input.next().charAt(0);
        System.out.println(caractere);
    }
}
