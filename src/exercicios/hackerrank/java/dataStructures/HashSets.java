package exercicios.hackerrank.java.dataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class HashSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<HashSet<String>> set = new HashSet<>();
        int counter = 0;

        for(int i=0; i<pair_left.length; i++){
            HashSet<String> tuple = new HashSet<>();
            tuple.add(pair_left[i]);
            tuple.add(pair_right[i]);

            if(!set.contains(tuple)) {
                set.add(tuple);
                counter++;
            }
            System.out.println(counter);
        }
    }
}
