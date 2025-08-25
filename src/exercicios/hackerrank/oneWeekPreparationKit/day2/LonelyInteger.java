package exercicios.hackerrank.oneWeekPreparationKit.day2;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int i = 0;
        while (i < a.size()) {
            boolean found = false;
            int j = i + 1;
            while (j < a.size()) {
                if (a.get(i).equals(a.get(j))) {
                    found = true;
                    a.remove(j);
                    break;
                }
                j++;
            }
            if (!found) {
                return a.get(i);
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = List.of(3,6,2,2,4,3,6,1,4,7,1);
//        ArrayList<Integer> arr = new ArrayList<>(arr);
        ArrayList<Integer> arr = new ArrayList<>(arr1);

        System.out.println(lonelyinteger(arr));
    }
}
