package academy.devdojo.maratonajava.javacore.K_enum.domain;

public class Cliente {
    // Dá pra definir enumerações dentro de classes,
    // Teria que: import academy.devdojo.maratonajava.javacore.K_enum.domain.Cliente.TipoPagamento
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    // Não definir nenhum modif de acesso permite que qualquer classe dentro do mesmo
    // pacote poderá acessar diretamente esse atributo diretamente.

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
