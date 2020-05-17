package lab5.ch5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFrequency {
    private String inputFile;
    private List<String> wordList = new ArrayList<String>();
    private List<Integer> wordFrequency = new ArrayList<Integer>();

    public WordFrequency(String inputFile) {
        this.inputFile = inputFile;
        this.readFile(this.inputFile);
        this.sortList();
    }

    private void readFile(String filePath){
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)));
            String word;
            while (scanner.hasNext()) {
                word = scanner.next().replaceAll("[^a-zA-Z ]", "").toLowerCase();
                if (this.wordList.contains(word))
                {
                    int index = this.wordList.indexOf(word);
                    this.wordFrequency.set(index, this.wordFrequency.get(index) + 1);
                }
                else{
                    this.wordList.add(word);
                    this.wordFrequency.add(1);
                }
            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void sortList(){
        int n = this.wordFrequency.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if ( this.wordFrequency.get(j) < this.wordFrequency.get(j + 1))
                {
                    int temp = this.wordFrequency.get(j);
                    this.wordFrequency.set(j, this.wordFrequency.get(j+1));
                    this.wordFrequency.set(j+1, temp);
                    String tempW = this.wordList.get(j);
                    this.wordList.set(j, this.wordList.get(j+1));
                    this.wordList.set(j+1, tempW);
                }
    }

    public void print() {
        int maxIndex = 9;
        if (this.wordList.size() < 9){
            maxIndex = this.wordList.size() - 1;
        }

        for (int index = 0; index <= maxIndex; index++){
            System.out.println(String.format("%s - %d", this.wordList.get(index), this.wordFrequency.get(index)));
        }

    }
}
