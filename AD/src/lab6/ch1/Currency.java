package lab6.ch1;

import sun.lwawt.macosx.CSystemTray;

public abstract class Currency {
    private double units;

    public Currency() {
        System.out.println("aaa");
    }

    public Currency(double units) {
        System.out.println("bbb");
        this.units = units;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }


}
