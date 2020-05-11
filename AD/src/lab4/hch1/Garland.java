package lab4.hch1;

import java.util.List;

public class Garland extends TreeDecorator{
    protected List<List<String>> tree;
    protected List<List<String>> old_tree;

    public Garland(DecorableTree tree){
        super(tree, 7, "B");
        this.tree = getTree(tree);
    }

}
