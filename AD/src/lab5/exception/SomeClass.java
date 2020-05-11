package lab5.exception;

public class SomeClass {

    public void methodUncheckedException(int i){
        if(i==0) {
            UnchException e = new UnchException("created in methodUncheckedException");
            throw e;
        }
        System.out.println(String.format("After UnchException. Result = %s", 5/i));
    }

    public void methodCheckedException(int i) throws ChException{
        if(i==2) {
            ChException ce = new ChException("number 2 not accepted");
            throw ce;
        }
//        System.out.println(String.format("After UnchException. Result = %s", 5/i));
    }
}
