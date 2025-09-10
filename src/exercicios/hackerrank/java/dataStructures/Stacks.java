package exercicios.hackerrank.java.dataStructures;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static boolean isBalancedOptimized(String s){
        if(s.isEmpty()) return false; // ou true????
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) { // É um abridor
                stack.push(c);
            } else if(map.containsValue(c)) { // É um fechador

                // Se o caractere atual não fechar o último abridor, retorna falso
                // Precisa desempacotar o Wrapper do mapa???
                if (c != map.get(stack.pop())) // Na real, tem que conferir se fecha ele, né
                    return false;
            } else {
                return false; // Se o caractere for desconhecido, retorna falso
            }
        }
        // Se ficou algum abridor sem fechar, retorna falso
        return stack.isEmpty();
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalancedOptimized(input));
        }
        sc.close();
    }
}
