package academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain;

// Adicionar e remover alunos???
// Usar ArrayList pra isso?
// Colocar id's para fácil verificação?
// Incluir data???
public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void gerarRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println(local.info());
        if (alunos != null) {
            System.out.println("Alunos inscritos:");
            for (Aluno aluno : alunos) {
                System.out.print(" - ");
                aluno.imprimeDados();
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
