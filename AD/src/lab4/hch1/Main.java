package lab4.hch1;

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        christmasTree.display();
        DecorableTree decorableTree = new Garland(christmasTree);
        decorableTree.display();
    }
}
