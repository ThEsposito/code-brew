package nelioalves.s18_lambdas.A_comparators.domain;

import java.util.Comparator;

/*
É mais interessante utilizar comparators porque, se quisermos mudar a forma de comparação entre
os produtos, precisaríamos alterar o compareTo() da classe em si (o que não é ideal)!
 */
public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
