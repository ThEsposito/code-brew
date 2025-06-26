// Associação (ou composição) pt3: Associaçã Unidirecional Muitos para UM
// Escola 1 -- N Professor
// Escola faz referência pros professores, mas os professores não fazem referencia pra escola

package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Paulo");
        Professor professor2 = new Professor("Patrícia");
        Professor professor3 = new Professor("Rodrigo");
        Escola escola = new Escola("Manoel Izídio", new Professor[]{professor1, professor2, professor3});

        escola.imprime();
    }
}
