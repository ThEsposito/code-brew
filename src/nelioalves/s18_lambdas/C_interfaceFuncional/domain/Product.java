package nelioalves.s18_lambdas.C_interfaceFuncional.domain;

public class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return name.toUpperCase().compareTo(otherProduct.getName().toUpperCase());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Da aula de Consumer:
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    // Estou diretamente no escopo da classe! Posso fazer o que eu quiser aqui.
    public void nonStaticPriceUpdate(){
        this.price *= 1.1;
    }


    // Da aula de Function:

    // Método estático:
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    // Método não-estático
    public String nonStaticUpperCaseName(){
        return name.toUpperCase();
    }
}
