package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade<0 || idade>100){
            System.out.println("Idade inválida");
            return;
        }

        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
