package algorithm.merge;


/**
 * 小和问题：归并思想
 * */
public class SmallSum {

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5};
        System.out.println(smallSum(array));
    }
    public static int smallSum(int[] array){
        if (array == null || array.length < 2){
            return 0;
        }
       return mergeProssing(array,0,array.length - 1);
    }

    private static int mergeProssing(int[] array, int left, int right) {
        if (left == right){
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        return mergeProssing(array,left,mid)+
                mergeProssing(array,mid +1 ,right)
                +merger(array,left,mid,right);
    }

    private static int merger(int[] array, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = 0;
        int leftTarget = left;
        int rightTarget = mid + 1;
        int result = 0;
        while (leftTarget <= mid && rightTarget <= right){
            result  += array[leftTarget] < array[rightTarget] ? array[leftTarget] * (right - rightTarget + 1) : 0;
            tmp[i++] = array[leftTarget] < array[rightTarget] ? array[leftTarget++] : array[rightTarget++];
        }
        while (leftTarget <= mid){
            tmp[i++] = array[leftTarget ++];
        }

        while (rightTarget <= right){
            tmp[i++] = array[rightTarget ++];
        }

        for (int j = 0; j < tmp.length; j++) {
            array[left + j] = tmp[j++];
        }

        return result;
    }
}
