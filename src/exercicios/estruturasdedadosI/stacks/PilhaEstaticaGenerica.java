package exercicios.estruturasdedadosI.stacks;

import java.util.EmptyStackException;

public class PilhaEstaticaGenerica<T> {
    private static final int DEFAULT_SIZE = 100;
    private final int size;
    private final T[] arr;
    private int top;

    public PilhaEstaticaGenerica(int size){
        if(size<=0) throw new IllegalArgumentException("Suze must be greater than 1");
        this.size = size;
        this.top = -1;
        arr = (T[]) new Object[size];
    }

    public PilhaEstaticaGenerica() {
        this.size = DEFAULT_SIZE;
        this.top = -1;
        arr = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        return top<0;
    }

    public boolean isFull(){
        return top>=(size-1);
    }

    public void push(T e) throws RuntimeException{
        if(isFull()) throw new RuntimeException ("Estouro da pilha");
        arr[++top] = e;
    }

    public T pop() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        return arr[top--];
    }

    public T top() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        return arr[top];
    }
}
