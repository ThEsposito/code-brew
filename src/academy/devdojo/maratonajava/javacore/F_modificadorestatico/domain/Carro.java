package academy.devdojo.maratonajava.javacore.F_modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
        // Não é adequado usar o this em statics, porque o this referencia ao atributo DO OBJETO
        // O static indica que é um atributo que referencia à classe como um todo.
        }

        public static void setVelocidadeLimite(double velocidadeLimite){
            Carro.velocidadeLimite = velocidadeLimite;
        }

        public static double getVelocidadeLimite(){
            return velocidadeLimite; // Não precisa de "Carro." pq n tem variável local (parâmetro)
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
