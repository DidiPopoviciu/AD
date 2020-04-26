package lab2.Ch3;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("*spider eats*");
    }
}
