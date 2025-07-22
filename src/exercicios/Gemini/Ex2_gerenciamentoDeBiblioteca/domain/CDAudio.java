package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain;

public class CDAudio extends ItemBiblioteca{
    private String artista;
    private int numeroFaixas;

    public CDAudio(int anoPublicacao, String titulo, String artista, int numeroFaixas) {
        super(anoPublicacao, titulo);
        this.artista = artista;
        this.numeroFaixas = numeroFaixas;
    }

    // Calcular prazo a partir do numero de faixas?
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
