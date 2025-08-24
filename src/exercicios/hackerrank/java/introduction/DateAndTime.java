package exercicios.hackerrank.java.introduction;
import java.time.LocalDate;

public class DateAndTime {
    public static String findDay(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8,13,2025));
    }
}
