package academy.devdojo.maratonajava.javacore.J_modificadorFinal.test;

import academy.devdojo.maratonajava.javacore.J_modificadorFinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.J_modificadorFinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
//      Carro.VELOCIDADE_LIMITE = 2; Daria pau, já que o valor da var já foi atribuído

        System.out.println(carro.COMPRADOR);

/*      Comprador comp1 = new Comprador();
        carro.COMPRADOR = comp1;

        Não deixa, já que carro.COMPRADOR já foi inicializado (com o construtor)
        dentro do escopo da classe
 */
        carro.COMPRADOR.setNome("Theozão comprador de fusca");
        System.out.println(carro.COMPRADOR);
        // Os atributos de objetos final podem ser reatribuídos livremente
    }
}
