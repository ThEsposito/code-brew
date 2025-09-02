package exercicios.algoritmoseprogramacaoII.stacks.exercicio_aula3;
import java.util.EmptyStackException;

public class Pilha {
    public static final int DEFAULT_SIZE = 100;
    private int top;
    // Vamos usar para fazer balanceamento de parenteses, por isso char
    private final char[] e;

    public Pilha(int size) {
        e = new char[size];
        top = -1;
    }

    public Pilha() {
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (e.length-1);
    }

    // Coloquei uma Runtime pra não ser obrigado a tratar a exceção
    public void push(char c) throws RuntimeException {
        if(isFull()) throw new RuntimeException("Pilha cheia");

        e[++top] = c;
    }

    public char pop() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        return e[top--];
    }

    public char top() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return e[top];
    }
}
