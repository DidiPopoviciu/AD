package lab2.Ch3;

import sun.lwawt.macosx.CSystemTray;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("------------Fish");
        d.eat();
        d.play();
        System.out.println("name: " + d.getName());
        d.setName("Jerry");
        System.out.println("new name: " + d.getName());
        d.walks();

        System.out.println("------------Cat");
        c.eat();
        c.play();
        System.out.println("name: " + c.getName());
        c.setName("Jerry");
        System.out.println("new name: " + c.getName());
        c.walks();

        System.out.println("------------ Animal Fish");
        a.eat();
        a.walks();

        System.out.println("------------Spider");
        e.eat();
        e.walks();

        System.out.println("------------Pet Cat");
        p.play();
        System.out.println("name: " + p.getName());
        p.setName("Tommy");
        System.out.println("new name: " + p.getName());
    }
}
