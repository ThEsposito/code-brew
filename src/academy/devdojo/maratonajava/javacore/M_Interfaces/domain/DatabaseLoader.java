package academy.devdojo.maratonajava.javacore.M_Interfaces.domain;

// Não usamos extends em interfaces! Usamos implements
public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize() na classe DatabaseLoader");
    }


    }
