package exercicios.HackerRank.java.strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split("[ !,?._'@]+");

        System.out.println(arr.length);
        for(String word : arr) System.out.println(word);

        scan.close();
    }

}
