package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto prod = new Computador("Ryzen 9", 15000);

        Tomate tomate = new Tomate("Italiano", 8, "24/05");

        tomate.setDataValidade("11/08/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(prod);
    }
}
