package lab4.ch6;

import sun.lwawt.macosx.CSystemTray;

public class Main {
    public static void main(String[] args) {
        Person ion = new Person.PersonBuilder("Ion").buildPerson();
        System.out.println(ion.toString());

        Person ion2 = new Person.PersonBuilder("Ion2").setJob("Inginer").buildPerson();
        System.out.println(ion2.toString());

        Person ion3 = new Person.PersonBuilder("Ion3").setJob("Inginer").setUniversity("UPT").buildPerson();
        System.out.println(ion3.toString());

        Person ion4 = new Person.PersonBuilder("Ion4").setJob("Inginer").setUniversity("UPT").setDrivingLicense(
                true).buildPerson();
        System.out.println(ion4.toString());

        Person ion5 = new Person.PersonBuilder("Ion5").setJob("Inginer").setUniversity("UPT").setDrivingLicense(
                true).setMarried(true).buildPerson();
        System.out.println(ion5.toString());


    }
}
