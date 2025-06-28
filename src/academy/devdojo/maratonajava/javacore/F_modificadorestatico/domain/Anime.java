package academy.devdojo.maratonajava.javacore.F_modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1- É alocado um espaço em memória para o objeto
    // 2- Cada atributo de classe é criado e inicializado com valores padrão ou oq for passado
    // 3- O bloco de inicialização é executado
    // 4- O construtor é executado;


    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for(int i=0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {
        System.out.println("Dentro do construtor");
        for(int episodio:Anime.episodios){
            System.out.print(episodio+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
