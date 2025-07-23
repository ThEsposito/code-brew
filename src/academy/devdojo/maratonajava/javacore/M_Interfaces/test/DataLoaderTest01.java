package academy.devdojo.maratonajava.javacore.M_Interfaces.test;

import academy.devdojo.maratonajava.javacore.M_Interfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.M_Interfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.M_Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        // Duas classes implementam um mesmo métdo de forma diferente
        // A interface define um contrato que "obriga" as classes que a implementam a implementar
        // seus métodos de alguma forma
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        // retrieveMaxDataSize é estático, então não pode ser sobrescrito
        // Posso criar um métdo de mesmo nome na classe implementada, porém, terei acesso às duas versões:
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
