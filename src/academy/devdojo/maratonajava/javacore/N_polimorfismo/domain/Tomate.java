package academy.devdojo.maratonajava.javacore.N_polimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;

    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor*IMPOSTO_POR_CENTO;
    }

    public String getDataValidade(){
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Tomate{" +
                "dataValidade='" + dataValidade + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
