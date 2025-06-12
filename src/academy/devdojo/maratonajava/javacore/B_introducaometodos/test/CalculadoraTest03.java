package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;
import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDeDoisNumerosInteiros(86,0);

    }
}