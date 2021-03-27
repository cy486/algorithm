package algorithm;

import static algorithm.Main.swap;

/**
 * 选择排序：O(n^2)
 * */
public class select {
    public static void selectSort(int[] array){
        if (array == null || array.length < 2){
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minNumber = i;
            for (int j = i +1 ; j < array.length; j++) {
                minNumber = array[minNumber] < array[j] ? minNumber : j;
            }
            swap(array,i,minNumber);
        }
    }
}
