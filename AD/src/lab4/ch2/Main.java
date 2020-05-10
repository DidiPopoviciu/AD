package lab4.ch2;


import com.sun.deploy.util.StringUtils;
import com.sun.scenario.effect.Merge;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Main {
    private static void displaySorted(SortingStrategy strategySort, Integer[] array){
        strategySort.sort(array);
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,56,3,33,5,2,7};

        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);

        System.out.print("Bubble sort: ");
        for (Integer el: copy01OfArr){
            System.out.print(String.format("%s ", el));
        }

        System.out.print("\nMerge sort: ");
        for (Integer el: copy02OfArr){
            System.out.print(String.format("%s ", el));
        }
    }

}
