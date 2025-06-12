package academy.devdojo.maratonajava.javacore.A_introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.A_introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Theo - Nome declarado no teste";
        System.out.println(estudante.nome); // Vai sair como o valor de inicializ. padrão!
        System.out.println(estudante.sexo); // Dá pra colocar uma inicial. padrão na declaração do atributo na classe
        System.out.println(estudante.idade);

        Estudante estudante2 = new Estudante();
        System.out.println(estudante2.nome);

    }
}
