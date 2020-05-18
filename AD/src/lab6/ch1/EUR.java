package lab6.ch1;

public class EUR extends Currency{
    public EUR(){ super(); }

    public EUR(double units) {
        super(units);
    }


    @Override
    public String toString() {
        return "EUR: " + getUnits();
    }
}
