package lab4.visitor;

public class Book implements Element{
    private int numberOfPages;
    private int cost;

    public Book(int numberOfPages, int cost) {
        this.numberOfPages = numberOfPages;
        this.cost = cost;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
