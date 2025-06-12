package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Decisao_e_Repeticao_Ex1 {
    public static void main(String[] args) {
        System.out.println("Digite a média das suas notas: ");
        Scanner leitor = new Scanner(System.in);
        double nota = leitor.nextDouble();
        System.out.println("Digite a sua frequência: ");
        int frequencia = leitor.nextInt();

        String status = "";
        if (frequencia < 75) {
            status = "reprovado";
        } else {
            if (nota > 6.0) {
                status = "aprovado";
            } else {
                status = "de PF, papae";
            }
        }
        System.out.println("Voce está " + status + "!");
    }
}
