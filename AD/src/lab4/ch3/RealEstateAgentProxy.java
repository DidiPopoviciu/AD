package lab4.ch3;

public class RealEstateAgentProxy implements AgentProxy{

    private Apartment[] apartments = new Apartment[5];
    private int index = 0;
    @Override
    public void represent(Apartment apartment) {
        this.apartments[index++] = apartment;
    }

    @Override
    public Apartment rent(Student student) {
        Apartment rented = null;
        if (!student.getName().startsWith("P")) {
            for (Apartment ap : this.apartments) {
                if (rented != null) {
                    if (rented.getMonthlyRentCost() > ap.getMonthlyRentCost()) {
                        rented = ap;
                    }
                }
                else if (ap.getMonthlyRentCost() <= student.getMoney()) {
                    rented = ap;
                }
            }
        }
        return rented;
    }
    public Apartment[] getApartments() {
        return apartments;
    }
}
