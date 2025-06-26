package academy.devdojo.maratonajava.javacore.G_associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;
    // Usamos um objeto como atributo dentro de uma classe.
    // Quando instanciarmos um jogador, teremos um objeto (da classe Time) dentro de outro objeto
    // (da classe Jogador).

    // Isso é composição (ou associação) de objetos!

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(time != null) {
            System.out.println(time.getNome()); // Get, pq o atrib nome (do time) é privado
        }
    }

    public Time getTime() { // Associação: unidirecional, um pra muitos
        return time;        // Vários objetos da classe Jogador podem ter o mesmo objeto
    }                       // da classe Time.
                            // Mas cada jogador só pode ter 1 time: Time 1---N Jogador

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
