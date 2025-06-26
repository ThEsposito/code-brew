// Associação (ou composição) pt1: Arrays de objetos

package academy.devdojo.maratonajava.javacore.G_associacao.test;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;
public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
//        Jogador[] jogadores = new Jogador[3];

        for(Jogador jogador:jogadores){
            jogador.imprime();
        }

    }
}
