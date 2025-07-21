package academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    @Override
    public void imprime(){
        System.out.println("Imprimindo em Funcionario...");
        System.out.println(this);
        // this aqui referencia ao objeto que instanciamos no Teste.
        // Printar this chama o toString() do objeto, mesmo que ele seja de uma subclasse de
        // Funcionario.
    }

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
