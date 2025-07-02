package academy.devdojo.maratonajava.javacore.I_sobrescrita.test;

import academy.devdojo.maratonajava.javacore.I_sobrescrita.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Doctor Stone");
        System.out.println(anime); // chama o mtodo toString() da classe (se houver
        // sobrescrita) implicitamente
    }
}
