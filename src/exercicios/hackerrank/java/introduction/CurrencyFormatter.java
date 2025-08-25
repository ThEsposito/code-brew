package exercicios.hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double payment = 12324.134;
        sc.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        // Não sabia que dava para construir um Locale personalizado (sem as enums), então tinha pensado
        // em formatar a saída por conta própria:


//        String strPayment = String.valueOf(payment);
//        String[] n = strPayment.split("[.]");
//
//        int j=1;
//        String result = "";
//        for(int i=n[0].length()-1; i>=0; i--){
//            result = n[0].charAt(i) + result;
//            if(j%3==0 && j!=0) result = ',' + result;
//            j++;
//        }
//        String india = "Rs."+(result+'.'+n[1].substring(0,2));

        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

        // Obs: o construtor de Locale está obsoleto desde o java 19, mas mantive porque a versão no HackerRank é a 8.
        // Atualmente, poderíamos instanciar com o mét. estático:   Locale.of("en","in");
    }
}
