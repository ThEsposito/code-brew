package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cleiton");
        funcionario.setIdade(45);
        funcionario.setSalarios(new double[]{1500, 1456, 2600});
        // Tem que instanciar o array, já q isso não foi feito na declaração do metodo

        funcionario.imprimeDados();
        funcionario.imprimeMediaSalarial();
    }
}