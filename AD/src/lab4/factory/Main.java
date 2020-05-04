package lab4.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new NYPizzaStore();

        Pizza p1 = pizzaFactory.orderPizza("Cheese");
        System.out.println(p1.toString() + '\n');


        Pizza p2 = pizzaFactory.orderPizza("Spicy");
        System.out.println(p2.toString() + '\n');

        Pizza p3 = pizzaFactory.orderPizza("Ananas");
        System.out.println(p3.toString() + '\n');

    }
     // TODO: create Chicago Pizza store

}
