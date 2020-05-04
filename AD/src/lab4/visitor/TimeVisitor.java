package lab4.visitor;

public class TimeVisitor implements Visitor{
    private int totalTime = 0;

    public void visit(Element[] elements){
        for (Element e:elements){
            e.accept(this);
        }

    }

    public void visit(Book book) {
        totalTime += book.getNumberOfPages() * 10;
    }

    public void visit(Audio audio) {
        totalTime += audio.getTime();
    }

    public void visit(Video video) {
        totalTime += video.getTime();
    }

    public int getTotalTime() {
        return totalTime;
    }
}
