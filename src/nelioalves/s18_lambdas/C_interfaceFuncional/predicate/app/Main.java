package nelioalves.s18_lambdas.C_interfaceFuncional.predicate.app;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import nelioalves.s18_lambdas.C_interfaceFuncional.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        /* Todos os diferentes códigos abaixo realizam a mesma operação! */

        // O métdo abaixo, que recebe uma expressão lambda, faz o mesmo que o outro abaixo
        // Ele é chamado de expressão lâmbda não-declarada.
        list.removeIf(p -> p.getPrice()<=100);

        // É o mesmo que criar uma classe que implementa o métdo abstrato de uma interface
        // funcional! E A implementação retorna a expressão que passamos como argumento ali em cima.
        // Essa expressão é o retorno que colocamos na impementação do métdo abstrato
        ProductPredicate productPredicate = new ProductPredicate();
        list.removeIf(productPredicate);

        // Ele também aceita a referência para um métdo!
        // Sendo ele estático (passando um objeto como argumento)
        // ou Não estático (usando o objeto em si)

        // Podemos criar uma variável do tipo Predicate, que recebe uma expressão lâmbda:
        // Chamada expressão lâmbda declarada

        double min = 100;
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);
    }
}
