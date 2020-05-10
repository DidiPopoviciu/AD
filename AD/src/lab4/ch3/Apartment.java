package lab4.ch3;

public class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
