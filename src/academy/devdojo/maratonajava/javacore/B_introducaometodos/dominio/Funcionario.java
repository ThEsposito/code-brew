package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class Funcionario {
    // SEMPRE defina valores padrão para evitar erros

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {

        return this.media;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null)
            return;
        for (double sal_atual : salarios) {
            System.out.print(sal_atual + " ");
        }
        System.out.println();
    }
    public void imprimeMediaSalarial() {
        if (this.salarios == null)
            return;

        double media = 0;
        for (double salario : salarios) {
        media += salario;
        }
        System.out.println(media / salarios.length);
    }
}
