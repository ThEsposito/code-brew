package nelioalves.s18_lambdas.C_interfaceFuncional.function.util;

import nelioalves.s18_lambdas.C_interfaceFuncional.domain.Product;

import java.util.function.Function;

// Implementação da interface Function:
/*
T (tipo de entrada): Product
R (tipo de saída): String
*/
public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p){
        return p.getName().toUpperCase();
    }
}
