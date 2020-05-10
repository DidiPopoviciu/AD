package lab4.ch3;

public class Main {

    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi02", 600);
        Apartment app03 = new Apartment("Crangasi03", 350);
        Apartment app04 = new Apartment("Crangasi04", 400);
        Apartment app05 = new Apartment("Crangasi05", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Ponescu", 300);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        Apartment apartmentForStudent02 = proxy.rent(student02);

        System.out.println(String.format("%s rented %s", student01.toString(),
                (apartmentForStudent01 != null)?apartmentForStudent01.toString():apartmentForStudent01));
        System.out.println(String.format("%s rented %s", student02.toString(),
                (apartmentForStudent02 != null)?apartmentForStudent02.toString():apartmentForStudent02));

    }
}
