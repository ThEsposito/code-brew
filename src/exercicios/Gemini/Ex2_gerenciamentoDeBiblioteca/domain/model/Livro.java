package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain.model;

public class Livro extends ItemBiblioteca{
    private String autor;
    private int numeroPaginas;

    public Livro(int anoPublicacao, String titulo, String autor, int numeroPaginas) {
        super(anoPublicacao, titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public int calcularPrazoEmprestimo(){
        // 7 dias para cada 200 páginas
        return 7*(numeroPaginas/200);
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
                "\nAutor: " + autor +
                "\nNumero de Páginas: " + numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
