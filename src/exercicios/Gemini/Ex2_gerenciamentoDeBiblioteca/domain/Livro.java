package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain;

public class Livro extends ItemBiblioteca{
    private String autor;
    private int numeroPaginas;

    public Livro(int anoPublicacao, String titulo, String autor, int numeroPaginas) {
        super(anoPublicacao, titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // todo: Livros terão prazo de entrega maior, a depender do nro de páginas??
    @Override
    public int calcularPrazoEmprestimo(){
        return 21;
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
