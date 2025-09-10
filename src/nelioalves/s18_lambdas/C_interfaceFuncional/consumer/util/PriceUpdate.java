package nelioalves.s18_lambdas.C_interfaceFuncional.consumer.util;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    // O métdo abstrato da interface abstrata
    @Override
    public void accept(Product p) {
        // Aumenta os preços de 10 em 10%
        p.setPrice(p.getPrice() * 1.1);
    }
}
