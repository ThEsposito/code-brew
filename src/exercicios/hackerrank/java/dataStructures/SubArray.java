package exercicios.hackerrank.java.dataStructures;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int negSumCounter = 0;

        // i indica o ponto de partida das comparações (início)
//        for(int i=0; i<n; i++){
//            // j conta quantas comparações ocorrerão (fim)
//            for(int j=0; j<n-i; j++){
//                int sum = arr[i];
//
//                // k realiza a soma, a partir de i, até o limite i+j
//                for(int k=1; k<=j; k++){
//                    sum += arr[i+k];
//                }
//                if(sum<0) negSumCounter++;
//            }
//        }

        // Versão Otimizada
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n-i; j++){
                sum += arr[i+j];
                if(sum < 0) negSumCounter++;
            }
        }
        System.out.println(negSumCounter);
    }
}
