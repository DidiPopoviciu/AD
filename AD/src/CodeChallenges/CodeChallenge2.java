package CodeChallenges;

import java.lang.ref.SoftReference;

public class CodeChallenge2 {
    private static String compute(int number)
    {
        String output = "";
        if (number % 3 == 0){
            output += "Foo";
        }
        if (number % 5 == 0){
            output += "Bar";
        }
        if (number % 7 == 0){
            output += "Qix";
        }
        for (char ch: String.valueOf(number).toCharArray()) {
            if (ch == '3'){
                output += "Foo";
            }
            if (ch == '5'){
                output += "Bar";
            }
            if (ch == '7'){
                output += "Qix";
            }
        }
        if (output.equals("")){
            output += String.valueOf(number);
        }
        return output;
    }

    private static String compute2(int number){
        String output = "";
        output = compute(number);
        output = output.replace('0','*');
        return output;
    }
    public static void main(String[] args) {
        String result1 = "";
        result1 = compute(303);
        System.out.println("Result1: " + result1);
        String result2 = "";
        result2 = compute2(101);
        System.out.println("Result2: " + result2);

    }
}
