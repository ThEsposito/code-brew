package academy.devdojo.maratonajava.javacore.G_associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(nome);
        if(jogadores==null) return;
        for(Jogador jogador:jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Temos aqui uma relação unidirecional, porque os jogadores conhecem time,
    // mas o time não conhece os jogadores.
    // Não seria possível retornar os jogadores através de um objeto da classe time
    // Aí seria necessário uma lógicazinha pra pegar todos os jogadores de um time a partir de objetos
    // da classe Jogador.


    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
