package lab5.exception;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        try{
            sc.methodUncheckedException(2);
//            sc.methodUncheckedException(0);
            sc.methodCheckedException(2);
        } catch (ChException e){
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }
        System.out.println("after exception");
    }
}
