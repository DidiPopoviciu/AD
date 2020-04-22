package lab2;

public class Main {

    public static void main(String[] args) {
        Example example = new Example();
        int b = 5;
        int result = example.calculate(b);
        System.out.println("result = " + result);
        System.out.println("b = " + b);

        Example e = new Example();
        System.out.println("e.a = " + e.getA());

        example.incrementA(e);
        System.out.println("incremented e.a = " + e.getA());
//        example.setA();
    }
}
