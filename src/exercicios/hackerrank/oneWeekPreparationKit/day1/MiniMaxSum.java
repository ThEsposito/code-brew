package exercicios.hackerrank.oneWeekPreparationKit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Fico na dÚvida se vale mais a pena ordenar primeiro
        // (já que é um arr pequeno). E, se for ordenar, se implemento
        // com funções prontas do java ou implemento algum
        // algoritmo de ordenaÇÃo na mão.

        arr.sort(Comparator.naturalOrder());
        int size = arr.size();
        long min = arr.getFirst();
        long max = arr.getLast();

        for(int i=1; i<size-1; i++){
            min += arr.get(i);
            max += arr.get(size-i-1);
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<6;i++){
            list.add(i);
        }
        System.out.println(list);
        miniMaxSum(list);
    }
}
