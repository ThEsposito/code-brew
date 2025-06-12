package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros((int)10.2, 20.5f); // Fique de olho na tipagem dos parametros
    }
}
