package lab2.Ch3;

public class Fish extends Animal implements Pet{
    protected Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("*fish eats nom nom nom*");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("*fish plays around the aquarium*");
    }

    @Override
    public void walks() {
        System.out.println("*fish can't walk*");
    }
}
