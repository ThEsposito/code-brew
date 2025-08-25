package exercicios.hackerrank.java.dataStructures;

public class Generics {
    public static <T> void printArray(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
    }

    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
