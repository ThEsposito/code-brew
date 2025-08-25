package exercicios.hackerrank.oneWeekPreparationKit;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();

        int zero = 0;
        int neg = 0;
        int pos = 0;

        int actual;

        for(int i=0; i<n; i++){
            actual = arr.get(i);
            if(actual>0){
                pos++;
            } else if(actual<0){
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double) pos/n);
        System.out.printf("%.6f\n", (double) neg/n);
        System.out.printf("%.6f\n", (double) zero/n);
    }


}
