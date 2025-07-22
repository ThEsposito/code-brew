package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.test;

import exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain.*;

import java.util.ArrayList;

public class BibliotecaTest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro(2020, "Diário de um Banana", "Eu", 150);
        Livro livro2 = new Livro(2021, "Diário de um Banana2", "Eu", 150);

        Revista rev1 = new Revista(2024, "PlayBoy: sexo intenso", 2, Mes.DEZEMBRO);

        CDAudio cd1 = new CDAudio(2018, "Astroworld", "Travis Scott", 17);

        Biblioteca lib = new Biblioteca();
        lib.adicionarItem(livro1);
        lib.adicionarItem(rev1);
        lib.adicionarItem(cd1);
        lib.adicionarItem(livro2);

        lib.emprestarItem(cd1.getID_UNICO().toString());
        lib.emprestarItem(cd1.getID_UNICO().toString());
        System.out.println(lib.listarTodosItens());

        ArrayList<ItemBiblioteca> teste = lib.buscarItemPorTitulo("diário");
        for (ItemBiblioteca item: teste){
            System.out.println(item.getTitulo());
        }
    }
}
