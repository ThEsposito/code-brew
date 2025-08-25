package exercicios.gemini.Ex2_gerenciamentoDeBiblioteca.model;

public class CDAudio extends ItemBiblioteca{
    private final String artista;
    private final int numeroFaixas;

    public CDAudio(int anoPublicacao, String titulo, String artista, int numeroFaixas) {
        super(anoPublicacao, titulo);
        this.artista = artista;
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public int calcularPrazoEmprestimo(){
        return 3;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
                "\nArtista: " + artista +
                "\nNúmero de Faixas: " + numeroFaixas;
    }
}
