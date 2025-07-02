package academy.devdojo.maratonajava.javacore.J_modificadorFinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;
    private final Comprador COMPRADOR = new Comprador();
    // Se n colcoar o new Comprador() vai dar uma exceção.
    // Já q obriga a inicializar a variável.

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
