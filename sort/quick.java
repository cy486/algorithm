package algorithm.sort;

public class quick {

    public static void quickSort(int[] array){
        if (array == null || array.length < 2){
            return;
        }
        quickSortProcess(array,0,array.length - 1);
    }

    public static void quickSortProcess(int[] array,int l,int r){
        if (l < r){
            swap(array,l + (int) (Math.random() * (r - l + 1)), r);
            int[] arr = partition(array,l ,r);
            quickSortProcess(array,l,arr[0] - 1);
            quickSortProcess(array,arr[1] + 1,r);
        }
    }

    private static int[] partition(int[] array, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more){
            if (array[l] < array[r]){
                swap(array,++less,l++);
            }else if (array[l] > array[r]){
                swap(array,l,--more);
            }else {
                l++;
            }
        }
        swap(array,more,r);
        return new int[]{less+1,more};
    }

    static void swap(int[] array, int firstNumber, int secondNumber) {
        int tmp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tmp;
    }

}
