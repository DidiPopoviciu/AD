package lab4.visitor;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        Element[] elements = new Element[4];

        Book book = new Book(10, 3);
        Book book2 = new Book(100, 4);

        Video video = new Video(23,4);

        Audio audio = new Audio(23,3);

        elements[0] = book;
        elements[1] = book2;
        elements[2] = video;
        elements[3] = audio;

        Visitor costVisitor = new CostVisitor();
        costVisitor.visit(elements);
        System.out.println(String.format("Total cost: %d", ((CostVisitor)costVisitor).getTotalCost()));

        TimeVisitor timeVisitor = new TimeVisitor();
        timeVisitor.visit(elements);
        System.out.println(String.format("Total time: %d", ((TimeVisitor)timeVisitor).getTotalTime()));

    }
}
