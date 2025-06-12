package academy.devdojo.maratonajava.introducao;

public class Matrizes_pt2 {
    public static void main(String[] args){
        int[][] matrizInt = new int[3][];
        matrizInt[0] = new int[3];
        matrizInt[1] = new int[4];
        matrizInt[2] = new int[5];      // Cada linha tem tamanho diferente!!!!


        for(int[] linha : matrizInt) {
            System.out.println();
            for (int coluna : linha) {
                System.out.print(coluna);
            }
        }
    }
}
