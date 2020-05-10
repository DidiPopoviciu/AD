package lab4.ch1;

public class ArrayCustomIterator implements Iterator{
    private int[] array;
    private int index;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
    }

    public boolean hasNext(){
        return index < array.length;
    }

    public int next(){
        return array[index++];
    }
}
