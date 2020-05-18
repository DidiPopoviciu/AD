package lab6.ch1;

public class USD extends Currency{
    public USD(double units) {
        super(units);
    }

    public USD() { super(); }

    @Override
    public String toString() {
        return "USD: " + getUnits();
    }
}
