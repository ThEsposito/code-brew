package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        // Programação orientada à interfaces:
        Repositorio repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();

        /*
        Colocamos uma interface como tipo da variável de referência.

        Dessa forma, se quiséssemos salvar em um arquivo bastaria apenas trocar o tipo
        do objeto.

        Um bom exemplo do uso disso é o caso da interface List, onde podemos instanciar:
        ArrayList, LinkedList, etc. Onde todos implementam o métdo add() de forma diferente.
         */

        // Programar orientado a interfaces facilita a manutenção e expansão do projeto.
    }
}
