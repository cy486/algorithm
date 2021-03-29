package algorithm.quick;


//荷兰国旗问题
public class NetherlandsFlag {
    public static int[] partition(int[] array,int left,int right,int num){
        int less = left - 1;
        int more = right + 1;
        int cur = left;
        while (cur < more){
            if (array[cur] < num){
                swap(array,++less,cur++);
            }
            else if (array[cur] > num){
                swap(array,--more,cur);
            }
            else {
                cur++;
            }
        }
        return new int[]{left +1 ,more -1};
    }

    static void swap(int[] array, int firstNumber, int secondNumber) {
        int tmp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tmp;
    }
}
