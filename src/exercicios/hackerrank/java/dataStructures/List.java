package exercicios.hackerrank.java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) list.add(sc.nextInt());

        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            String line = sc.next();
            int x = sc.nextInt();

            if(line.equals("Delete")) {
                list.remove(x);
            } else if(line.equals("Insert")){
                int y = sc.nextInt();
                list.add(x, y);
            }
        }

        for(Integer i : list){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
