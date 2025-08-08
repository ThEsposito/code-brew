package academy.devdojo.maratonajava.javacore.N_polimorfismo.service;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
