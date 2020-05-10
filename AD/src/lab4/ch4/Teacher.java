package lab4.ch4;

public class Teacher implements  ObservedSubject{
    private Observer[] students = new Observer[10];
    private int index = 0;

    @Override
    public void register(Observer obj) {
        this.students[index++] = obj;
    }

    @Override
    public void unregister(Observer obj) {

    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o: students){
            if (o != null) {
                o.update(message);
            }
        }
    }

    public void teach(String subject){
        this.notifyObservers(subject);
    }
}
