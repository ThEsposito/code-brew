package exercicios.hackerrank.java.strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String trimmed = s.trim();

        if(trimmed.isEmpty()){
            System.out.println(0);
        } else {
            String[] arr = trimmed.split("[ !,?._'@]+");
            System.out.println(arr.length);

            for(String word : arr) System.out.println(word);
        }
        scan.close();
    }
}
