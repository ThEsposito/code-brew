package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto prod = new Computador("Ryzen 9", 15000);

        // Consegue acessar o construtor sobrecarregado na classe Tomate
        // Já que o construtor é um "métdo especial" que retorna a referência (ponteiro)
        // para um objeto.
        Produto prod2 = new Tomate("Italiano", 8, "24/05");

        // Ainda vai executar no escopo da classe Tomate.
        // Porque a variável de referência controla/chama uma ação, mas quem executa
        // é o OBJETO.

        // Como a variável de referência é do tipo Produto, ela não conhece os atributos e
        // métodos ESPECÍFICOS/EXCLUSIVOS do Tomate (subclasse).
        // Ela consegue acessar nome, valor e calcularImposto porque são coisas que ela conhece
        // por terem sido definidas no seu escopo ou "herdadas" da interface
        System.out.println(prod2.getNome());
        System.out.println(prod2.getValor());
        System.out.println(prod2.calcularImposto());
//        System.out.println(prod2.getDataValidade()); Dá erro, mesmo tendo sido atribuído no construtor!

        // Executa no escopo da classe Computador (o tipo do objeto)
        System.out.println(prod.getNome());
        System.out.println(prod.getValor());
        System.out.println(prod.calcularImposto());

    }
}
