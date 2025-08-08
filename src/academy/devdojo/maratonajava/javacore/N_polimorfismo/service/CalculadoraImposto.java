package academy.devdojo.maratonajava.javacore.N_polimorfismo.service;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();

        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

        /* Também funcionaria:
        String dataValidade = ((Tomate) produto).getDataValidade;
        ou simplesmente:
        System.out.println( ((Tomate)produto).getDataValidade() );
         */
    }
}
