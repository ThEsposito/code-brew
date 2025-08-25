package exercicios.chatgpt.Ex3;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double[] notas;

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public Aluno(String nome, double nota1, double nota2, double nota3, double... notas){
        this(nome,nota1,nota2,nota3);
        this.notas = new double[notas.length];
        this.notas = notas.clone();

    }

    public void setNotas(double... notas){
        this.notas = new double[notas.length];
        this.notas = notas;
    }

    public double calcularMedia(){
        return ((this.nota1+this.nota2+this.nota3)/3);
    }

    public void situacao(){
        double media = this.calcularMedia();
        if(media<6){
            System.out.println("O aluno "+nome+" está reprovado!");
            return;
        }
        System.out.println("O aluno "+nome+" está aprovado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }



}
