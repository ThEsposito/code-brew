package academy.devdojo.maratonajava.javacore.L_classesabstratas.teste;

import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Zoro", 12000);
        System.out.println(gerente);
        System.out.println(dev);
        dev.imprime();
    }
}
