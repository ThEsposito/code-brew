package exercicios.algoritmoseprogramacaoII.stacks;

import java.util.EmptyStackException;

public class PilhaEstatica {
    public static final int MAX_SIZE = 500;
    private final int size;
    private final int[] arr;
    private int top;

    public PilhaEstatica() {
        top = -1;
        this.size = MAX_SIZE;
        this.arr = new int[MAX_SIZE];
    }

    public PilhaEstatica(int size) {
        top = -1;
        this.size = size;
        this.arr = new int[size];
    }

    // Queria colocar uma exceção no lugar de um erro, mas okay
    public void push(int e) throws StackOverflowError {
        if(this.isFull()) throw new StackOverflowError();
        arr[++top] = e;
    }

    // A exceção é unchecked, já que é filha de RuntimeException
    public int top() throws EmptyStackException {
        if(!isEmpty()) return arr[top];
        throw new EmptyStackException();
    }

    public int pop() throws EmptyStackException {
        if(!isEmpty()) return arr[top--];
        throw new EmptyStackException();
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    // Coloquei >= por precaução, mas nem precisava já que só dá pra aumentar top de 1 em 1.
    public boolean isFull(){
        return top>=(size-1);
    }

}
