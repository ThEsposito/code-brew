package academy.devdojo.maratonajava.javacore.K_enum.test;

import academy.devdojo.maratonajava.javacore.K_enum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.K_enum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Theo", TipoCliente.PESSOA_JURIDICA);
    }
}
