package lab2.Ch3;

import java.net.Inet4Address;

//public abstract class GraphicObject {
//    // declare fields
//    // declare nonabstract methods
//    abstract void draw();
//}
public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    abstract void eat();

    public void walks(){
        System.out.println(String.format("*walks on %s legs*", this.legs));
    }
}
