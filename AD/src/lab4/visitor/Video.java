package lab4.visitor;

public class Video implements Element{
    private int time;
    private int cost;

    public Video(int time, int cost) {
        this.time = time;
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
