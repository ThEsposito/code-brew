package nelioalves.s18_lambdas.C_interfaceFuncional.consumer.app;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import nelioalves.s18_lambdas.C_interfaceFuncional.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
Ao contrário do Predicate, que é uma expressão lambda que retorna o resultado de uma
expressão lógica (recebendo o generic que passamos como parâmetro), o Consumer realiza
uma operação (e não retornar nada), que pode alterar os atributos daquele objeto (ao chamar
métodos, por exemplo).
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        // o .forEach() recebe um consumer como argumento.
        // Ele percorre uma coleção e executa esse Consumer em cada iteração
        // (em cada elemento).
        list.forEach(new PriceUpdate());


        // Reference method estático: poderia criar, em produto, um método estático que recebe
        // como parâm um Product e altera o preco ele (sem retornar nada)

        // O parâmetro de staticPriceUpdate já é inferido!
        list.forEach(Product::staticPriceUpdate);

        // Reference method não estático: simplesmente alteraria o atributo do Produto
        list.forEach(Product::nonStaticPriceUpdate);

        // Expressão lâmbda não-declarada
        list.forEach(p -> p.setPrice(p.getPrice()*1.1));

        // Expressão lâmbda declarada:
        double atualizPreco = 1.1;
        Consumer<Product> cp = p->p.setPrice(p.getPrice()*atualizPreco);
        list.forEach(cp);
    }
}
