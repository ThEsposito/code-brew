package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.domain.Pessoa;

public class Funcionario2 extends Pessoa {

    public Funcionario2(String nome){
        super(nome);
    }

    public void imprime(){
        this.nome= "sasa"; // Mesmo fora do pacote, Funcionario2 tem acesso
        // ao atributo nome (protected) porque extende a classe Pessoa.
    }
}
