package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(float num1, float num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2!=0){
            return num1/num2;
        }
        return 0;
    }
    public void imprimeDivisaoDeDoisNumerosInteiros(double num1, double num2){
        if(num2==0){
            System.out.println("Não existe divisão por zero");
            return; // Early Exit
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        // Esse ' ... ' é uma sintaxe que transforma os inúmeros parâmetros em um vetor
        // Assim, posso passar uma qtde ilimitada de parâmetros, ao invés de um vetor contendo eles

        // Quando temos o varargs, não podemos colocar mais nenhum parâm depois
        // Ou seja, em caso de múltiplos parâm, o varargs deve ser o último
        // Já que não dá pra saber quando os param do varargs terminam e o os do próximo começam
        int soma = 0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
}