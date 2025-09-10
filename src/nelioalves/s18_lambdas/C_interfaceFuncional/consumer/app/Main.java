package nelioalves.s18_lambdas.C_interfaceFuncional.consumer.app;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import nelioalves.s18_lambdas.C_interfaceFuncional.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        // o .forEach() recebe um consumer como parâmetro

        list.forEach(new PriceUpdate());

        // Expressão lâmbda não-declarada
        list.forEach(p -> p.setPrice(p.getPrice()*1.1));

        // Reference method estático: poderia criar, em produto, um método estático que recebe
        // como parâm um Product e altera o preco ele (sem retornar nada)
        list.forEach(System.out::println);

        // Reference method não estático: simplesmente alteraria o atributo do Produto

        // Expressão lambda declarada:
        double atualizPreco = 1.1;
        Consumer<Product> cp = p->p.setPrice(p.getPrice()*atualizPreco);
        list.forEach(cp);
    }
}
