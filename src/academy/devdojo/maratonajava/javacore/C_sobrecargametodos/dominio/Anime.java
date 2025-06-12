package academy.devdojo.maratonajava.javacore.C_sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero; // Atributo recém implementado, quando a classe já estava pronta e
                           // cheia de ocorrencias

    public void init(String tipo, int episodios, String nome){
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    public void init(String tipo, int episodios, String nome, String genero){
        this.init(tipo,episodios, nome); // Assim, não precisamos alterar todas as ocorrências do primeiro metodo init
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
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