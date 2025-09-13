package nelioalves.s18_lambdas.C_interfaceFuncional.funcoesEmParametro.service;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public static double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0;
        for (Product p : list){
            // Basta chamar o método que nossa interface funcional possui
            if(criteria.test(p)){
                sum+=p.getPrice();
            }
        }
        return sum;
    }
}
