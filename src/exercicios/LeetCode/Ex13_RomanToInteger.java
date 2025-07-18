package exercicios.LeetCode;

public class Ex13_RomanToInteger {
    static int LinearValueFinder(char symbol){
        char[] symbols = {'I','V','X','L', 'C', 'D', 'M'};
        int[] values = {1,5,10,50,100,500,1000};

        for(int i=0; i<7; i++){
            if(symbols[i] == symbol){
                return values[i];
            }
        }
        return -1;
    }

    // Notei que uma busca binária pode não ser tão interessante em vetores pequenos kkkk
    static int BinaryValueFinder(char symbol){
        char[] symbols = {'C', 'D', 'I', 'L', 'M', 'V', 'X'};
        int[] values = {100, 500, 1, 50, 1000, 5, 10};

        int begin = 0;
        int end = 6; //Max index of symbols

        System.out.println("Symbol = " + symbol);
        while(begin<=end){
            int middle = (begin+end)/2;
            System.out.println("Middle: " + symbols[middle]);

            if(symbols[middle] == symbol){
                return values[middle];

            } else if(symbol < symbols[middle]){
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        long inicio_execucao = System.currentTimeMillis();
        int dec = 0;
        int i = s.length() - 1;
        while(i>=0){
            int actualValue = BinaryValueFinder(s.charAt(i));
            if(i>0) {
                int nextValue = BinaryValueFinder(s.charAt(i - 1));
                if(actualValue == nextValue) {
                    dec += actualValue + nextValue;
                    i -= 2;
                } else if (actualValue < nextValue) {
                    dec += actualValue;
                    i--;
                } else {
                    dec += actualValue - nextValue;
                    i -= 2;
                }
            } else {
                dec += actualValue;
                i--;
            }
        }
        System.out.println(dec);
        long fim_execucao = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim_execucao - inicio_execucao) + "ms");
    }
}
