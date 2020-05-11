package lab4.hch1;

import lab4.hch1.DecorableTree;

import java.util.List;

public abstract class TreeDecorator extends ChristmasTree{
    protected DecorableTree tree;
    private int row;
    private String decoration;

    public TreeDecorator(DecorableTree tree, int row, String decoration){
        super();
        System.out.println("construstor Tree Decorator");
        this.row = row;
        this.decoration = decoration;

    }

    public List<List<String>> getTree(DecorableTree tree) {
         List<String> row;
         List<List<String>> a;
         a= super.getTree();
         return a;
    }

    @Override
    public void display() {
    }
}