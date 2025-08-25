package exercicios.algoritmoseprogramacaoII;
import java.util.Scanner;

public class Aula2_DecisaoERepeticao_ex1 {

    public static int fatorialRecursivo(int n){
        if(n==1){
            return 1;
        }
        return n*fatorialRecursivo(n-1);
    }

    public static void main(String[] args){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while(n<1) {
            System.out.println("Digite o número pro fatorial (maior que 0):");
            n = scanner.nextInt();
            if(n<1){
                System.out.println("Você é burro ou faz de propósito????");
            }
        }
        int fat = n;
        for(int i=n-1; i>1; i--){
            fat*= i;
        }
        System.out.println("Seu fatorial: " + fat);
        System.out.println("Seu fatorial RECURSIVO: " + fatorialRecursivo(n));
    }
}