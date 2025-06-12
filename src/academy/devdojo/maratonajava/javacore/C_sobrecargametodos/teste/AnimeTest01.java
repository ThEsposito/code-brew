package academy.devdojo.maratonajava.javacore.C_sobrecargametodos.teste;
import academy.devdojo.maratonajava.javacore.C_sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
    // É bom ter um metodo pra inicializar todos os atributos, pra não ocorrer o caso de
    // um atributo recém adicionado causar problemas em chamadas de metodos pre-existentes.
    // A convenção é utilizar o metodo chamado como init?????.
        Anime anime = new Anime();
        // Sobrecarga de métodos
        // anime.init("TV", 12, "As Aventuras de TakaroApiroka"); Metodo antes de implementar o atributo genero
        anime.init("TV", 12, "As Aventuras de TakaroApiroka", "Acão");
        anime.imprime();
    }
}