package CodeChallenges;
// write a program that prints the numbers from 1 to 100
// but for multiples of 3 print "Fizz" instead of the number
// and for the multiples of 5 print "Buzz"
// for numbers which are multiple of both 3 and 5 print "FizzBuzz"

//for multiple of 7 print Rizz
//for multiple of 11 print Jazz


public class CodeChallenge1 {
    private static String checkNumberStageOne(int number)
    {
        String output = "";
        if (number % 3 == 0){
            output += "Fizz";
        }
        if (number % 5 == 0){
            output += "Buzz";
        }
        if (output.equals("")){
            output += String.valueOf(number);
        }
        return output;
    }
    private static String checkNumberStageTwo(int number)
    {
        String output = "";
        if (number % 7 == 0){
            output += "Rizz";
        }
        if (number % 11 == 0){
            output += "Jazz";
        }
        if (output.equals("")){
            output = checkNumberStageOne(number);
        }
        return output;
    }
    public static void main(String[] args) {
        int i;
        String out = "";
        System.out.println("Stage 1");
        for (i=1; i<=100; i++){
            out = checkNumberStageOne(i);
            System.out.print(out);
            if (i < 100){
                System.out.print(", ");
            } else{
                System.out.println(". ");
            }
        }
        System.out.println("Stage 2");
        for (i=1; i<=100; i++){
            out = checkNumberStageTwo(i);
            System.out.print(out);
            if (i < 100){
                System.out.print(", ");
            } else{
                System.out.println(". ");
            }
        }
    }
}
