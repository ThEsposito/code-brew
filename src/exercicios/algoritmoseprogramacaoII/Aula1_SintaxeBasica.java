package exercicios.algoritmoseprogramacaoII;
import java.util.Scanner;

public class Aula1_SintaxeBasica {
    public static int fatRecursivo(int n){
        if(n==1){ // Caso base
            return 1;
        }
        return n*fatRecursivo((n-1)); // Passo recursivo
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo:");
        String modelo = scanner.nextLine();

        System.out.println("Digite a distância percorrida:");
        int distancia = scanner.nextInt();

        System.out.println("Digite o consumo de combustível:");
        int consumo = scanner.nextInt();

        double consumoMedio = (double) distancia/ (double) consumo; // Casting

        System.out.println("Modelo do Veículo: "+modelo);
        System.out.println("Consumo médio: " + consumoMedio + "km/l");
        System.out.println("Distancia quadruplicada: " + (distancia<<2));
        boolean isEconomico = consumoMedio<5;
        System.out.println("É economico?: " + isEconomico);

        System.out.println(fatRecursivo(3));
    }
}