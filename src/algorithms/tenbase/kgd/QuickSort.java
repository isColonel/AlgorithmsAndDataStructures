package algorithms.tenbase.kgd;

public class QuickSort {

    //数组array中下标为i和j位置的元素进行交换
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void recQuikcSort(int[] array, int left, int right) {
        if (right <= left) {
            //终止递归
            return;
        } else {
            int partition = partition(array,left,right);
            recQuikcSort(array,left,partition-1);
            recQuikcSort(array,partition+1,right);
        }
    }


    private static int partition(int[] array, int left, int right) {
        //为什么j加1，i没有加1，原因在于下方的循环判断是从--j和++i开始的
        //而基准元素选的array[left],即是第一个元素，所以左游标从第二个元素开始比较
        int i = left;
        int j = right + 1;
        //pivot为选取的基准元素（头元素）
        int pivot = array[left];
        while (true) {

            while (i < right && array[++i] < pivot) {
            }
            while (j > 0 && array[--j] > pivot) {
            }
            //左右游标相遇时候停止，所以挑出while循环
            if (i >= j) {
                break;
            } else {
                swap(array, i, j);
            }
        }
        //基准元素和游标相遇时候所指元素交换，为最后一次交换
        swap(array, left, j);
        return j;
    }

    public static void sort(int[] array) {
        recQuikcSort(array, 0, array.length - 1);
    }

    //测试
    public static void main(String[] args) {
        int[] array = {9,9,8,7,6,5,4,3,2,1};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}


