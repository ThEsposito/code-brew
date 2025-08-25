package exercicios.hackerrank.oneWeekPreparationKit;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for(int i=1; i<=n;i++) {
            String msg = "";
            boolean devoSkippar = true;
             if(i%3==0){
                 if(i%5==0){
                 msg = "FizzBuzz";
                 } else {
                     msg = "Fizz";
                 }
             } else if(i%5==0){
                     msg = "Buzz";
             }
             else {
                 msg = String.valueOf(i);
             }
//            if (i % 3 == 0) {
//                msg += "Fizz";
//                devoSkippar = false;
//            }
//            if (i % 5 == 0) {
//                msg += "Buzz";
//                devoSkippar = false;
//            }
//            if (devoSkippar) {
//                System.out.println(i);
//                continue;
//            }
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        long ti = System.currentTimeMillis();
        fizzBuzz(15);
        long tf = System.currentTimeMillis() - ti;
        System.out.println("tempo exec:"+tf);
    }
}
