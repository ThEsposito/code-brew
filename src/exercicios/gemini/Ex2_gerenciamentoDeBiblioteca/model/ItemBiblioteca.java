package exercicios.gemini.Ex2_gerenciamentoDeBiblioteca.model;
import java.util.UUID;

public abstract class ItemBiblioteca {
    private final String titulo;
    private final int anoPublicacao;
    private final UUID ID_UNICO;
    public static final int DIAS_PADRAO_EMPRESTIMO = 14;
    private StatusItem status = StatusItem.DISPONIVEL;

    {
        this.ID_UNICO = UUID.randomUUID();
    }

    public ItemBiblioteca(int anoPublicacao, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    public abstract int calcularPrazoEmprestimo();
    public String exibirDetalhes(){
        return "Título: " + titulo +'\n' +
                "Ano de Publicação: " + anoPublicacao + '\n' +
                "Status: " + status.getDESCRICAO();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public UUID getID_UNICO() {
        return ID_UNICO;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }

}
