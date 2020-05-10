package lab4.ch4;

import javafx.beans.Observable;

public class Student implements Observer {
    String name;

    @Override
    public void update(String message) {
        System.out.println(String.format("Student %s learned about %s", this.name, message));
    }

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }

}
