package exercicios.hackerrank.java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer[]> numbers = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int d = sc.nextInt();
            Integer[] line = new Integer[d];
            for (int j = 0; j < d; j++) {
                line[j] = sc.nextInt();
            }
            numbers.add(line);
        }

        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if(x < numbers.size()){
                if(y<numbers.get(x).length){
                    System.out.println(numbers.get(x)[y]);
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
