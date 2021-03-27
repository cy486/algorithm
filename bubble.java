package algorithm;

import static algorithm.Main.swap;

/**
 * 冒泡排序 时间复杂度：O(n^2)
 * */
public class bubble {


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

}
