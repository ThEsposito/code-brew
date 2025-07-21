package academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
        // Obs: apesar de calculaBonus() ter sido chamado dentro da superclasse, ele
        // ainda assim vai variar conforme a subclasse que foi instanciada, já que
        // QUEM EXECUTA O MÉTDO É O OBJETO.
    }

    public abstract void calculaBonus();
}
