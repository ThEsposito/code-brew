package exercicios.hackerrank.java.strings;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=0; i<s.length()-k+1; i++){
            String actualSubstring = s.substring(i,i+k); // Aqui
            if(actualSubstring.compareTo(smallest) < 0){
                smallest = actualSubstring;
            } else if(actualSubstring.compareTo(largest) > 0){
                largest = actualSubstring;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
