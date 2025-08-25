package exercicios.gemini.Ex2_gerenciamentoDeBiblioteca.test;

import exercicios.gemini.Ex2_gerenciamentoDeBiblioteca.model.*;
import exercicios.gemini.Ex2_gerenciamentoDeBiblioteca.service.Biblioteca;

import java.util.ArrayList;

public class BibliotecaTest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro(2007, "Diário de um Banana", "Jeff Kinney", 221);
        Livro livro2 = new Livro(1947, "O diário de Anne Frank", "Anne Frank", 445);
        Livro livro3 = new Livro(1990, "Introduction to Algorithms", "Thomas H. Cormen", 1312);
        Revista rev1 = new Revista(2024, "Revista Recreio", 2, Mes.DEZEMBRO);

        CDAudio cd1 = new CDAudio(2018, "Astroworld", "Travis Scott", 17);

        Biblioteca lib = new Biblioteca();
        lib.adicionarItem(livro1);
        lib.adicionarItem(rev1);
        lib.adicionarItem(livro3);
        lib.adicionarItem(cd1);
        lib.adicionarItem(livro2);

        lib.emprestarItem(cd1.getID_UNICO().toString());
        lib.emprestarItem(cd1.getID_UNICO().toString());
        System.out.println(lib.listarTodosItens());

        ArrayList<ItemBiblioteca> teste = lib.buscarItemPorTitulo("diário");
        for (ItemBiblioteca item: teste){
            System.out.println(item.getTitulo());
        }

        System.out.println(livro1.calcularPrazoEmprestimo());
    }
}
