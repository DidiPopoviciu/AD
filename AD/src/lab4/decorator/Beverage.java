package lab4.decorator;

public abstract class Beverage {
    private String description;
    private int cost;

    public Beverage(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }


    public String getDescription() {
        return description;
    }


}
