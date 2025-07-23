package academy.devdojo.maratonajava.javacore.M_Interfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    // Todos os atributos de uma interface são CONSTANTES por padrão
    // Como também são estáticos, são intrínsecos à interface.

    void load();
    // Por padrão todos os métodos de uma interface são todos públicos e abstratos
    // Interfaces foram criadas com o intuito de prover um contrato para implementações dela.

    // default permite criar um métdo concreto numa interface, sem obrigar suas implementações a implementá-lo
    // Esse métdo será executado ao nível da interface, e não às implementações
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Interfaces podem ter métodos estáticos, que não podem ser sobrescritos
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize() na interface");
    }
}
