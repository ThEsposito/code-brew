package exercicios.Gemini.Ex1;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Liv1", "Teteco", 2006);
        System.out.println("-------------------");
        Livro livro2 = new Livro("Liv2", "Teco", 2019);
        livro1.imprimeDados();
        livro2.imprimeDados();
    }
}