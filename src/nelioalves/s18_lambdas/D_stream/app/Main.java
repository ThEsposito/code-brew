package nelioalves.s18_lambdas.D_stream.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13,4,5,10,7);

        // Usando o .map pra aplicar uma função pra cada elemento da Stream
        Stream<Integer> st1 = list.stream()
                .map(i -> i*10);

        // Pra imprimir a stream na tela: converter para vetor
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        // Cria uma stream com base num elemento inicial (seed) e
        // uma função de geração para cada elemento!!!

        // Essa stream é POTENCIALMENTE INFINITA
        // No entanto, o limit limita a geração para apenas 10 elementos!
        Stream<Integer> st3 = Stream.iterate(0,  x -> x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Geração da sequência de Fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L},
                x -> new Long[]{ x[1], x[0] + x[1] })
                .map( p -> p[0]);

        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
