package lab4.decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super("Mocha", 2, beverage);
    }
}
