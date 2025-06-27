package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.H_heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.H_heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua segredo, nro 50135");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tetequinho");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("123.456.789-11");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        // Métodos (e atributos) herdados:
        funcionario.setNome("Theo CLT");
        funcionario.setCpf("16501232545");
        funcionario.setEndereco(endereco);

        // Metodo/atributo próprio:
        System.out.println("---------------");
        funcionario.setSalario(15250.35); // Primeiro salario como dev junior <3 (sqn)
        funcionario.imprime();

        // Não estava imprimindo o salário, já q é um metodo de outra classe.
        // Sobrescrevemos o métdo e agora o salário tbem é imprimido.
    }
}
