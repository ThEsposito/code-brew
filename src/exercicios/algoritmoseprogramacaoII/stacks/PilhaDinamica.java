package exercicios.algoritmoseprogramacaoII.stacks;

import java.util.EmptyStackException;

// Pilha dinamica e encadeada
public class PilhaDinamica {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value){
        Node oldTop = top;
        top = new Node(value);
        top.previous = oldTop;
    }

    public int top() throws EmptyStackException {
        if(this.isEmpty()) throw new EmptyStackException();
        return top.value;
    }

    public int pop() throws EmptyStackException {
        if(this.isEmpty()) throw new EmptyStackException();
        Node oldTop = this.top;
        this.top.value = top.previous.value;
        this.top = top.previous;

        return oldTop.value;
    }
}

class Node {
    int value;
    Node previous;

    public Node(int value) {
        this.value = value;
    }
}
