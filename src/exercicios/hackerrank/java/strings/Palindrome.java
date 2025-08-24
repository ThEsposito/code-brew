package exercicios.hackerrank.java.strings;

import java.util.Scanner;

public class Palindrome {
    // É possível adaptar para ignorar espaços e case (maiúsculo ou minúsculo)
    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(isPalindrome(A)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

