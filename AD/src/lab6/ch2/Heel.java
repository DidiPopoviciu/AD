package lab6.ch2;

public class Heel implements Shoe{
    private double size;
    private String color;

    public Heel(double size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Heel{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
