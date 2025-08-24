package exercicios.hackerrank.oneWeekPreparationKit.day2;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr.size(); i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-i-1);
        }
        int dif = sum1-sum2;

        return Math.abs(dif);
    }
}
