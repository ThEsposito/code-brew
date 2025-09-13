package nelioalves.s18_lambdas.C_interfaceFuncional.function.app;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import nelioalves.s18_lambdas.C_interfaceFuncional.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    /*
    A interface funcional Function tem como seu único método abstrato, o método:
    R apply(T t);

    - Basicamente, é um generic <T,R> e seu método RECEBE UM PARÂMETRO DE TIPO T
    e RETORNA UM TIPO R.
     */

    /*
    Nosso programa:
    recebe uma lista de PRODUTOS e retorna uma lista com os nomes(STRING) em upper case.
     */

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        // Pra aplicar nossa Function em toda a lista, usamos a função map()
        /*
        A função map é uma função que aplica uma função em todos os elementos de uma stream
        - Resumindo, uma stream é uma sequência de dados.
        - A função map recebe uma stream. Por isso, precisamos converter nossa List em uma
        stream pra poder utilizar o map com a Function que nós implementamos!

        Conversões:
        - List para stream: .stream()
        - Stream para List: .collect(Collectors.toList())

        O map aplica uma função operação para cada elemento de uma stream
        */

        // Implementação da interface Function
        list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // Reference method com método estático
        list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // Reference method com método não estático
        list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // Expressão lambda declarada
        Function<Product, String> myFunction = p -> p.getName().toUpperCase();
        list.stream().map(myFunction).collect(Collectors.toList());

        // Expressão lambda não-declarada (inline)
        list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
    }
}
