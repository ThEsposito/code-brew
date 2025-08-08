package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto prod = new Computador("Ryzen 9", 15000);

        Produto tomate = new Tomate("Italiano", 8);

        Tomate tomateCast = (Tomate) tomate;
        tomateCast.setDataValidade("11/08/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(prod);
        System.out.println("--------------");

        // As duas variáveis referenciam ao mesmo objeto
        // No entanto, tomateCast (a variável de referência) tem o mesmo tipo do objeto e,
        // portanto, pode usar getDataValidade

        System.out.println(tomate.hashCode());
        System.out.println(tomateCast.hashCode());
        System.out.println(tomate);
        System.out.println(tomateCast);
    }
}
