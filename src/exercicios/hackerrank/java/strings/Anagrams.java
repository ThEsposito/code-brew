package exercicios.hackerrank.java.strings;

import java.util.Scanner;

public class Anagrams {
    static int linearSearch(char value, String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == value) return i;
        }
        return -1;
    }

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        int n = a.length();
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i=0; i<n; i++){
            int idx = linearSearch(b.charAt(i), a);
            if(idx == -1) return false;

            a = a.replaceFirst(Character.toString(b.charAt(i)), "");
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
