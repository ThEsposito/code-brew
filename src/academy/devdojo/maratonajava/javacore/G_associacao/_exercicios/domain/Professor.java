package academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain;

// Adicionar e remover seminários??????
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    // Construtores
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);

        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminários que " + nome + " ministra:");
            for (Seminario seminario : seminarios) {
                System.out.println(" - " + seminario.getTitulo());
                // Incluir endereço tbem??
            }
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
