package exercicios.algoritmoseprogramacaoII.stacks;

import exercicios.algoritmoseprogramacaoII.stacks.PilhaDinamica;

public class PilhaTest {
    public static void main(String[] args) {
//        PilhaEstatica p = new PilhaEstatica(5);
//
//        System.out.println("Está vazia?: "+p.isEmpty()+" Está cheia?: "+p.isFull());
//
//        p.push(5);
//        p.push(4);
//        p.push(3);
//        p.push(2);
//        p.push(1);
//        System.out.println("Agora está cheia? "+p.isFull()+" Estáv vazia? "+p.isEmpty());
        PilhaDinamica p = new PilhaDinamica();
        System.out.println("Está vazia?: "+p.isEmpty());
        for(int i=0; i<150; i++) p.push(i);

        for(int i=0; i<150; i++) System.out.println(p.pop());

        System.out.println(p.pop());
        System.out.println(p.pop());

    }
}
