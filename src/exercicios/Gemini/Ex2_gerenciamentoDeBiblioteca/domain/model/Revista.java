package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain.model;

public class Revista extends ItemBiblioteca{
    private int edicao;
    private Mes mesPublicacao;

    public Revista(int anoPublicacao, String titulo, int edicao, Mes mesPublicacao) {
        super(anoPublicacao, titulo);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    // Revistas tem um prazo de entrega menor
    @Override
    public int calcularPrazoEmprestimo(){
        return 7;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
                "\nEdição: " + edicao +
                "\nMes de Publicação: " + mesPublicacao.toString().toLowerCase();
    }

    public Mes getMesPublicacao() {
        return mesPublicacao;
    }
}
