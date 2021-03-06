package algorithm.sort;

import algorithm.sort.insert;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {46545,1,2,5,6,74,7,45,456};
        //bubble.BubbleSort(array);
        //select.selectSort(array);
        //insert.insetSort(array);
        //merge.mergeSort(array);
        quick.quickSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    static void swap(int[] array, int firstNumber, int secondNumber) {
        int tmp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tmp;
    }
}
