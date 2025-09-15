/*
Faça um programa que lê um conjunto de produtos a partir de um arquivo .csv

Em seguida mostre o preço médio dos produtos.
Depois, mostre os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao
preço médio.

    Exemplo:
Input FIle:
TV,900.0
Mouse,50.00
Tablet,350.0
HD Case, 80.90
Computer, 850.00
Monitor, 290.00

Execution:
Enter file path:
Average price: 420.23
Tablet
Mouse
Monitor
HD Case
 */
package nelioalves.s18_lambdas.D_stream.exercicio.app;

import nelioalves.s18_lambdas.A_comparators.domain.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite o caminho para o arquivo: ");
        String filePath = sc.nextLine().trim();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<Product> products = new ArrayList<>();

            String line = reader.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                products.add(
                        new Product(fields[0], Double.parseDouble(fields[1]))
                );
                line = reader.readLine();
            }
            double avg = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (a,b) -> a+b);

            avg/= products.size();
            System.out.println("Average: "+avg);

            double finalAvg = avg;
            products.stream()
                    .filter(p -> p.getPrice() < finalAvg)
                    .map(p-> p.getName())
                    .sorted((s1, s2) -> s2.compareToIgnoreCase(s1))
                    .forEach(System.out::println);

            // O comparator tem um método chamado revert(), que reverte o resultado dele
            // No nosso caso, de crescente pra decrescente;
        } catch(IOException ioe){
            System.out.println("ERRO DE ENTRADA DO ARQUIVO");
        }
    }
}
