package lab4.ch5;

public class AscBubbleSort extends TemplateMethodBubleSort{
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if (i1 < i2){
            return true;
        }
        return false;
    }
}
