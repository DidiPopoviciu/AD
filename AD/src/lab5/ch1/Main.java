package lab5.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("./src/lab5/io/phoneBoox.txt");
        System.out.println(pb.toString());
        System.out.println(pb.getNumberByName("B"));
    }
}
