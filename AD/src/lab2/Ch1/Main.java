package lab2.Ch1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(10,100, "Ion");
        Fighter f2 = new Fighter(12,105, "Vasile");
        Fighter f3 = new Fighter(10,100, "Ion");

//        if (f1.equals(f3)){
//            System.out.println("f1=f3");
//        }else {
//            System.out.println("f1!=f3");
//        }
        BoxingMatch bm = new BoxingMatch(f1,f2);
        System.out.println("f1 vs f2 = " + bm.fight());
    }
}
