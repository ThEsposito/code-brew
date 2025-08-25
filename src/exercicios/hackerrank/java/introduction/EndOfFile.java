package exercicios.hackerrank.java.introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCounter = 1;

        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(lineCounter + " " + line);
            lineCounter++;
        }
        sc.close();
    }
}
