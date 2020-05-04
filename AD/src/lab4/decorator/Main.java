package lab4.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage dr = new DarkRoast();
        Beverage drw = new Whip(dr);
        System.out.println(String.format("%s: %d", dr.getDescription(), dr.getCost()));
        System.out.println(String.format("%s: %d", drw.getDescription(), drw.getCost()));

        Beverage hb = new HouseBlend();
        hb = new Mocha(hb);
        hb = new Whip(hb);
        System.out.println(String.format("%s: %d", hb.getDescription(), hb.getCost()));

    }
}
