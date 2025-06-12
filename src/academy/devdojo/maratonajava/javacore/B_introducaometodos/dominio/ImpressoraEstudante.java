package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class ImpressoraEstudante {
    public static void imprime(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan ";
    }
}
