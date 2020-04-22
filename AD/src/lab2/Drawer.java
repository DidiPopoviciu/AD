package lab2;

public class Drawer {
    private int number_of_drawers = 3;
    private boolean opened;

    public void open(){
        this.opened = true;
    }

    public void close(){
        this.opened = false;
    }
}