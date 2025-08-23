package exercicios.HackerRank.java.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static int linearSearch(char value, Character[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value) return i;
        }
        return -1;
    }

    public static boolean isFechador(Character a, Character b){
        Character[] openings = {'{','(', '['};
        Character[] closings = {'}',')',']'};

        for(int i=0; i<openings.length; i++){
            if((a==openings[i] && b==closings[i]) || (a==closings[i] && b==openings[i])) return true;
        }
        return false;
    }

    public static boolean isBalanced(String s){
        Character[] openings = {'{','(', '['};
        Character[] closings = {'}',')',']'};
        Stack<Character> stack = new Stack<>();

        int idxOpening = linearSearch(s.charAt(0), openings);
        if(idxOpening == -1) return false; // Ja comecou com um fechador ou char invalido

        stack.add(openings[idxOpening]); // Adiciona o primeiro elemento abridor

        for(int i=1; i<s.length(); i++) {
            idxOpening = linearSearch(s.charAt(i), openings);

            // Se for abridor, adiciona na pilha e vai pro próximo caractere
            if (idxOpening != -1) {
                stack.add(openings[idxOpening]);

            } else {
                // Caractere inválido ou tentou fechar algo que nao foi aberto
                if(stack.isEmpty()) return false;

                int idxClosing = linearSearch(s.charAt(i), closings);

                // Caractere invalido.
                if (idxClosing == -1) {
                    return false;
                }

                // Se o Char encontrado fecha o último item da stack, remove ele.
                if (stack.lastElement() == openings[idxClosing]) stack.pop();
            }
        }
        // Se a stack terminou vazia, todos os chars de abertura foram fechados e nao houveram
        // caracteres invalidos.
        return stack.isEmpty();
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
}
