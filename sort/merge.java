package algorithm.sort;

//归并排序 O(N*logN)
public class merge {
    public static void mergeSort(int[] array){
        if (array == null || array.length < 2){
            return;
        }

        sortProsing(array,0,array.length - 1);
    }

    private static void sortProsing(int[] array, int left, int right) {
        if (left == right){
            return;
        }
        int mid = (left + right)/2;
        sortProsing(array,left,mid);
        sortProsing(array,mid + 1, right);

        mergeArray(array,left,mid,right);
    }

    private static void mergeArray(int[] array, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = 0;
        int leftTarget = left;
        int rightTarget = mid + 1;
        while (leftTarget <= mid && rightTarget <= right){
            tmp[i++] = array[leftTarget] < array[rightTarget] ? array[leftTarget++] : array[rightTarget ++];
        }
        while (leftTarget <= mid){
            tmp[i ++ ] = array[leftTarget++];
        }
        while (rightTarget <= right){
            tmp[i ++ ] = array[rightTarget++];
        }
        for ( i = 0;i <= tmp.length -1 ; i++){
            array[left + i] = tmp[i];
        }
    }
}
