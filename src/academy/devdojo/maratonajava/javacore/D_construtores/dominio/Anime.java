package academy.devdojo.maratonajava.javacore.D_construtores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String tipo, int episodios, String nome, String genero){
        this();
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    } // Sobrecarga de construtores

    public Anime(String tipo, int episodios, String nome, String genero, String estudio){
        this(tipo, episodios, nome, genero);
        this.genero = genero;
    }
    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}