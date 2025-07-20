package academy.devdojo.maratonajava.javacore.K_enum.test;

import academy.devdojo.maratonajava.javacore.K_enum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.K_enum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.K_enum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Theo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Portes", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        // Vira uma enum, a partir do seu nome (o nome da constante) em String;
        System.out.println(tipoCliente.getNomeRelatorio());

        // Vira uma enum, a partir DO VALOR DE UM DE SEUS ATRIBUTOS. Null, se for entrada inválida.
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
