package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序 时间复杂度：O(n^2)
 * */
public class Bubble {

    public static void main(String[] args) {
        int[] array = {46545,1,2,5,6,74,7,45,456};
        BubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void BubbleSort(int[] array){

        if (array == null || array.length < 2){
            return;
        }

        for (int end = array.length  -1 ; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (array[i] > array[i + 1]){
                    swap(array,i,i +1);
                }
            }
        }

    }

    private static void swap(int[] array, int firstNumber, int secondNumber) {
        int tmp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tmp;
    }

}
