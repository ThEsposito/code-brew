package exercicios.hackerrank.java.advanced;

public class FactoryPattern {

// Teste
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food1 = foodFactory.getFood("CAKE");
        Food food2 = foodFactory.getFood("pizza");

        System.out.println("The factory returned: " + food1.getClass());
        System.out.println(food1.getType());
        System.out.println("The factory returned: " + food2.getClass());
        System.out.println(food2.getType());

    }
}

interface Food {
    String getType();
}
class Pizza implements Food {
    @Override
    public String getType(){
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order){
        if(order.equalsIgnoreCase("pizza")) return (new Pizza());
        if(order.equalsIgnoreCase("cake")) return (new Cake());

        return null;
    }
}
