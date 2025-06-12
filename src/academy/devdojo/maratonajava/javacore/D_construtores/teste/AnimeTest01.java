package academy.devdojo.maratonajava.javacore.D_construtores.teste;

import academy.devdojo.maratonajava.javacore.D_construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("TV", 12, "As Aventuras de Takaro Apiroka", "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        System.out.println("----------------");
        anime2.imprime();
    }
}