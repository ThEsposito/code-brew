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
    }
}
