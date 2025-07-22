package academy.devdojo.maratonajava.javacore.M_Interfaces.domain;

// Não usamos extends em interfaces! Usamos implements
public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
