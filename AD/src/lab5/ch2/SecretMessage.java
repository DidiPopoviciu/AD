package lab5.ch2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {
    public SecretMessage(String path){
        char[] chars= readMessage(path);
        for (char c: chars){
            if(Character.isUpperCase(c)){
                if(c == 'X'){
                    System.out.print(' ');
                }
                else
                    System.out.print(c);
            }
        }
    }

    public char[] readMessage(String filePath){
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
}
