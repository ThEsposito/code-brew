package exercicios.hackerrank.oneWeekPreparationKit.day2;

import java.util.Arrays;
import java.util.List;


public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr){
        Integer[] counterArr = new Integer[100];

        for(int i=0; i<100; i++){
            counterArr[i] = 0;
        }
        for(int i= 0; i<arr.size(); i++){
            counterArr[arr.get(i)] += 1;
        }

        System.out.println(Arrays.toString(counterArr));
        return Arrays.asList(counterArr);
    }
}
