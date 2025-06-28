package academy.devdojo.maratonajava.javacore.H_heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do Bloco de Inicialização Estático de Pessoa");
    }

    {
        System.out.println("Dentro do 1o Bloco de Inicialização Não-Estático de Pessoa");

    }

    {
        System.out.println("Dentro do 2o Bloco de Inicialização Não-Estático de Pessoa");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do Construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){ // Sobrecarregando construtores
        this(nome); // Chama o construtor acima
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + ", " + this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
