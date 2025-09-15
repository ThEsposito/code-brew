package nelioalves.s18_lambdas.D_stream.pipeline.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream()
                .map(x -> x*10); // Multiplica cada elemento da lista por 10

        // o toArray é uma operação terminal, então ele processa a stream e me dá o resultado
        // Não é possível reutilizar essa mesma stream! Seria necessário chamar o .stream() novamente
        System.out.println(Arrays.toString(st1.toArray()));

        // O .reduce() recebe um elemento inicial (geralmente o elemento neutro da nossa operação)
        // e uma Function que recebe dois argumentos e gera um resultado
        // Obs: o reduce é uma operação terminal
        int sum = list.stream().reduce(0, (x1,x2) -> x1+x2);

        // Se fôssemos fazer um produtório (no lugar da somatória que fizemos), seria necessário
        // colocar 1 como o elemento inicial (elem neutro) e passar uma Function que realiza
        // a multiplicação dos dois números.

        System.out.println("Sum: "+sum);

        List<Integer> newList = list.stream()
                .filter(x -> x%2==0) // filtra pelos pares
                .map(x -> x*10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
