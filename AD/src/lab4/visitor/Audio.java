package lab4.visitor;

public class Audio implements Element{
    private int time;
    private int cost;

    public Audio(int time, int cost) {
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
