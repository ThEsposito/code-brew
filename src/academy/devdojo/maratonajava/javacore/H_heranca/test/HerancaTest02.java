package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.domain.Funcionario;

public class HerancaTest02 {

    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe Pai
    // 1 - Bloco de inicialização estático é executado quando a JVM carregar a classe Filha
    // 2 - É alocado um espaço em memória para o objeto da classe Pai
    // 3 - Cada atributo de classe Pai é criado e inicializado com valores padrão ou oq for passado
    // 4 - Os blocos de inicialização da classe Pai são executados (na ordem em q aparecem)
    // 5 - O construtor da classe Pai é executado;
    // 6 - É alocado um espaço em memória para o objeto da classe Filha
    // 7 - Cada atributo de classe Filha é criado e inicializado com valores padrão ou oq for passado
    // 8 - Os blocos de inicialização da classe Filha são executados (na ordem em q aparecem)
    // 9 - O construtor da classe Filha é executado;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraiya");
        Funcionario funcionario2 = new Funcionario("Jiraiya");
    }
}
