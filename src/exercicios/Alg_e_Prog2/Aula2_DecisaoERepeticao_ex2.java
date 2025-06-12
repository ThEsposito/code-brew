package exercicios.Alg_e_Prog2;
import java.util.Scanner;

public class Aula2_DecisaoERepeticao_ex2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao=1;
        
        while(opcao==1){
            System.out.print("Digite o valor de saque entre 10 e 1000R$ (múltiplos de 10): ");
            int saldo;
            int temp = scanner.nextInt();

            if ((temp % 10 != 0) || temp < 10 || temp > 1000) {
                System.out.println("Digite um valor válido na próxima.");

            } else {
                saldo = temp;
                int[] notas = {100, 50, 20, 10};
                System.out.println("\nSerão necessárias: ");
                for (int i = 0; i < 4; i++) {
                    System.out.println((int)saldo / notas[i] + " notas de " + notas[i] +"R$"); //Talvez dê B.O
                    saldo %= notas[i];
                }
            }
            System.out.println("Deseja realizar outra operação? (0-não 1-sim)");
            opcao = scanner.nextInt();
        }

    }
}
