package lab5.ch4;

import java.io.*;

public class NumberToLCD {
    private String input_file;
    private String output_file;
    private char[] numbers;
    private String row1 = "";
    private String row2 = "";
    private String row3 = "";
    public NumberToLCD(String input_file, String output_file) {
        this.input_file = input_file;
        this.output_file = output_file;
        numbers = readFile(input_file);
        System.out.println(numbers);
        this.convertToLCD();
        this.writeToFile(this.output_file);

    }

    private char[] readFile(String filePath){
        char[] chars = new char[1000];
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int c;
            int i=0;
            while ((c=br.read()) != -1){
                chars[i++] = (char) c;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chars;
    }

    private void convertToLCD(){
        for (char c: this.numbers) {
            if (c == '\u0000') break;
            else
                switch(c) {
                case '0':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat(" |  | ");
                    this.row3 = this.row3.concat(" |__| ");
                    break;
                case '1':
                    this.row1 = this.row1.concat("   ");
                    this.row2 = this.row2.concat(" | ");
                    this.row3 = this.row3.concat(" | ");
                    break;
                case '2':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat("  __| ");
                    this.row3 = this.row3.concat(" |__  ");
                    break;
                case '3':
                    this.row1 = this.row1.concat(" __  ");
                    this.row2 = this.row2.concat(" __| ");
                    this.row3 = this.row3.concat(" __| ");
                    break;
                case '4':
                    this.row1 = this.row1.concat("      ");
                    this.row2 = this.row2.concat(" |__| ");
                    this.row3 = this.row3.concat("    | ");
                    break;
                case '5':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat(" |__  ");
                    this.row3 = this.row3.concat("  __| ");
                    break;
                case '6':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat(" |__  ");
                    this.row3 = this.row3.concat(" |__| ");
                    break;
                case '7':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat("    | ");
                    this.row3 = this.row3.concat("    | ");
                    break;
                case '8':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat(" |__| ");
                    this.row3 = this.row3.concat(" |__| ");
                    break;
                case '9':
                    this.row1 = this.row1.concat("  __  ");
                    this.row2 = this.row2.concat(" |__| ");
                    this.row3 = this.row3.concat("  __| ");
                    break;
                default:
                    System.out.println("Unknown character found: " + c);
            }
        }
    }

    private void writeToFile(String filePath){
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(this.row1 + '\n');
            myWriter.write(this.row2 + '\n');
            myWriter.write(this.row3);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
