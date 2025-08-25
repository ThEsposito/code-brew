package exercicios.hackerrank.oneWeekPreparationKit;

public class TimeConversion {
    public static String timeConversion(String s) {
        String xM = s.substring(s.length()-2, s.length());
        int hour = Integer.parseInt(s.substring(0,2));
        if(xM.equals("PM")){
            if(hour!=12) hour+=12;
        } else if(hour==12) {
            hour=0;
        }
        return String.format("%02d%s", hour, s.substring(2,s.length()-2));
    }
}
