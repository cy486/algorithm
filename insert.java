package algorithm;

import static algorithm.Main.swap;

/**
 * 插入排序 时间复杂度：O(n^2)
 * */
public class insert {
    public static void insetSort(int[] array){
        if (array == null || array.length < 2){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i -1; j >= 0 && array[j + 1] < array[j] ; j--) {
                swap(array,j,j +1 );
            }
        }
    }
}
