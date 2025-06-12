package academy.devdojo.maratonajava.javacore.A_introducaoclasses.test;
import academy.devdojo.maratonajava.javacore.A_introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusquinha Mostro da vovó";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Uno Monstro";
        carro2.modelo = "Jato";
        carro2.ano = 2001;

        System.out.println("Carro 1:");
        System.out.println("    Nome: " + carro1.nome);
        System.out.println("    Modelo: " + carro1.modelo);
        System.out.println("    Ano: " + carro1.ano + '\n');


        System.out.println("Carro 2:");
        System.out.println("    Nome: " + carro2.nome);
        System.out.println("    Modelo: " + carro2.modelo);
        System.out.println("    Ano: " + carro2.ano);

        carro2 = carro1; // Exemplo de Referência

        System.out.println("\nCarro 2 (pós alteração):");
        System.out.println("    Nome: " + carro2.nome);
        System.out.println("    Modelo: " + carro2.modelo);
        System.out.println("    Ano: " + carro2.ano);

    }
}
