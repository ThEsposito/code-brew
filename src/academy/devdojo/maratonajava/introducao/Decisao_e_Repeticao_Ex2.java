package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Decisao_e_Repeticao_Ex2{
    public static void main(String[] args){
        Scanner leitinho = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Digite o valor total da compra");
            double valor = leitinho.nextDouble();
            double desconto = 1.0;
            if (valor < 100) {
                desconto -= 0.05;
            } else if (valor <= 300) {
                desconto -= 0.1;
            } else {
                desconto -= 0.15;
            }
            System.out.println("O valor final da compra ficou em: " + (valor*desconto) + " R$");
            System.out.println("Deseja realizar outra operacao? 1- sim; 0- nao");
            opcao = leitinho.nextInt();
        }while (opcao==1);
        System.out.println("\nPrograma encerrado!");

    }
}