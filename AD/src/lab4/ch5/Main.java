package lab4.ch5;

import java.util.Arrays;

public class Main {

    public static void displaySorted(Integer[] arr){
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(String.format("%d ", arr[i]));
        }

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,56,3,33,5,2,7};

        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);
        System.out.print("Asc: ");
        displaySorted(copy01OfArr);
        System.out.print("\nDesc: ");
        displaySorted(copy02OfArr);
    }
}
