package algorithms.tenbase.kgd;

import java.util.Arrays;

public class HeapSort {
    public static void  sort(int []arr){
        //1.构建大顶堆
        for(int i = arr.length/2-1; i >= 0; i--){
            //从第一个非叶子结点从下往上，从右到左调整结构
            adjustHeap(arr,i,arr.length);

        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1; j>0; j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    //调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
    public static void adjustHeap(int []arr, int i, int length){
        //先取出当前元素i
        int temp = arr[i];
        //从i结点的左子结点开始，也就是2i+1处开始
        for(int k=i*2+1; k<length; k=k*2+1){
            //如果左子结点小于右子结点，k指向右子结点
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }

    //交换元素
    public static void  swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        //不能直接输出数组，打印出来的是数组的地址
        System.out.println(Arrays.toString(arr));
    }

}
