package lab3.singleton;

public class Main {
    public static void main(String[] args) {
        LazyInit lazyInit = LazyInit.getInstance();
        System.out.println(lazyInit.getName());
        System.out.println(lazyInit);

        LazyInit lazyInit1 = LazyInit.getInstance();
        System.out.println(lazyInit1.getName());
        System.out.println(lazyInit1);

        EagerInit eagerInit1 = EagerInit.getInstance();
        System.out.println(eagerInit1.getName());
        System.out.println(eagerInit1);

    }
}
