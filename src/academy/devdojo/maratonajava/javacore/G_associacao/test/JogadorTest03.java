// Associação (ou composição) pt4: Associação Bidirecional
// Time 1 <-- N jogadores
// Jogadores fazendo referencia pro time e o time fazendo referencia pros jogadores (<-->)
// Relação simétrica


package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Cafu");
        Jogador jog2 = new Jogador("Pelé");

        Time time = new Time("Brasil");
        Jogador[] jogadores = new Jogador[]{jog1, jog2};


        jog1.setTime(time);
        jog2.setTime(time);
        // Numa relação bidirecional, atente-se sempre a firmar essa relação do
        // jogador pro time e do time pro jogador! Essa linha acima n pode ser esquecida!!
        // Senão, time fará referência pro jog2, mas o contrário não acontecerá.


        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jog1.imprime();
        System.out.println("---Jogador---");
        jog2.imprime();

        System.out.println("---Time---");
        time.imprime();

        System.out.println(jog1.getTime() == jog2.getTime());
        System.out.println(jog1.getTime() + " " + jog2.getTime());
    }
}
