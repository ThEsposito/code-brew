package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.ImpressoraEstudante;
import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Estudante;

// CUIDADO PRA NAO IMPORTAR O PACOTE ERRADO!!!
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("-------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        System.out.println();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);
        System.out.println("Nome depois do método: " + estudante01.nome);
        System.out.println("-------------------");
        impressora.imprime(estudante02);
        System.out.println("Quando passamos um parâmetro do tipo reference, criamos uma referência para esse mesmo objeto");
    }
}
