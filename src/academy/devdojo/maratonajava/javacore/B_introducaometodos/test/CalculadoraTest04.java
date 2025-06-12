package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
        System.out.println("Quando passamos parametros primitivos para um método, uma CÓPIA é enviada!!");
    }
}
