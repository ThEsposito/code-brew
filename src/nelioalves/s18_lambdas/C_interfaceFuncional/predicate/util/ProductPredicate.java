package nelioalves.s18_lambdas.C_interfaceFuncional.predicate.util;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    // O único métdo abstrato da classe
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
