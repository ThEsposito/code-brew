package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class Estudante {
    public String nome = "Nome padrão";
    public int idade;
    public char sexo;

    public void imprime(){
        // Assim, não precisamos de uma classe nova só pra imprimir os valores daqui

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        // O this é importante pra indicar que queremos utilizar a variável da CLASSE ATUAL.
        // Dessa forma, as variáveis que usamos aqui não interferem nas variáveis de fora.
    }
}