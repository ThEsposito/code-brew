package nelioalves.s18_lambdas.C_interfaceFuncional.funcoesEmParametro.app;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;
import nelioalves.s18_lambdas.C_interfaceFuncional.funcoesEmParametro.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("PC", 4999.99));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Tablet", 1200));

        // Somando preços dos produtos que começam com T
//        double sum = ProductService.filteredSum(list, p -> p.getName().charAt(0) == ('T'));
//        System.out.println(sum);

        // Somando todos os preços maiores ou iguais a 900
        double sum = ProductService.filteredSum(list, p -> p.getPrice() >= 900);
        System.out.println(sum);
    }
}
