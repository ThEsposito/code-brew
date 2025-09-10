package nelioalves.s18_lambdas.B_expressoesLambda.test;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import java.util.ArrayList;
import java.util.List;

public class ComparatorTest01 {
    public static int compareProducts(Product p1, Product p2){
        return p1.getName().compareToIgnoreCase(p2.getName());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("Tablet", 1200));

        // Expressões Lambda são funções anônimas (não foram declaradas e não tem nome) e são de
        // primeira classe (podem ser passadas como parâmetro para outras funções).
        list.sort(ComparatorTest01::compareProducts);
        list.forEach(System.out::println);
    }
}
