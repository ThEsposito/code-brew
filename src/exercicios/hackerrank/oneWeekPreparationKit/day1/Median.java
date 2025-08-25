package exercicios.hackerrank.oneWeekPreparationKit.day1;

import java.util.List;

public class Median {
    public static int median(List<Integer> arr){
        int size = arr.size();

        // Se a quantidade de elementos for ímpar, o retorno precisaria ser um double
        if(size%2 != 0 ) return -1;

        return arr.get((size+1)/2);
    }
}
