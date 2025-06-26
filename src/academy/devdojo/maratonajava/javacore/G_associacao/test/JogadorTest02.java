// Associação (ou composição) pt2: Associação Unidirecional Um pra Muitos
// Time 1 <-- N jogadores
// Jogadores fazendo referencia pro time, mas o time nao fazendo referencia pros jogadores

package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira"); // 2 objetos distintos. Sem relação entre eles
        jog1.setTime(time);
        jog1.imprime();

    }
}
