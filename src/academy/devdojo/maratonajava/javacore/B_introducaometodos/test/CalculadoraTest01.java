package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;
import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest01{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(); //Metodos sem retorno (tipo void)
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
