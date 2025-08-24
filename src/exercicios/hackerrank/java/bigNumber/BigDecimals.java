package exercicios.hackerrank.java.bigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimals {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        // Adapted Insertion Sort
        for (int i = 1; i < n; ++i) {
            String keyStr = s[i];
            BigDecimal keyBig = new BigDecimal(keyStr);

            int j = i - 1;

            while (j >= 0 && (new BigDecimal(s[j])).compareTo(keyBig) < 0) {
                s[j + 1] = s[j];
                j = j - 1;
            }
            s[j + 1] = keyStr;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
