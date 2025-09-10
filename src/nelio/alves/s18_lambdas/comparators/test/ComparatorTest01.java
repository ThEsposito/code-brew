package nelio.alves.s18_lambdas.comparators.test;

import nelio.alves.s18_lambdas.comparators.domain.MyComparator;
import nelio.alves.s18_lambdas.comparators.domain.Product;

import java.util.*;

public class ComparatorTest01 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        // Se a classe implementar Comparable:
        Collections.sort(list);

        // Se utilizarmos uma classe Comparator, já implementada
        list.sort(new MyComparator());

        // Usando sintaxe de classe anônima
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        };

        list.sort(comp);

        // Usando expressões lambda (funções anônimas):
        // O compilador faz uma inferência de tipo (por conta do Generic??)

        // tipoRetorno nomeFuncao = (param1, param2) -> { implementacao }

//        Comparator<Product> compLambda = (p1,p2) ->
//            return p1.getName().compareToIgnoreCase(p2.getName());
//        };


        // Reduzindo ainda mais (ocultando o retorno):
        Comparator<Product> compLambda = (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName());

    }
}
