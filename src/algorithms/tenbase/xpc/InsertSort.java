package algorithms.tenbase.xpc;

public class InsertSort {
    /*
    * 算法思想：
    * 1.取出待排序列的前两个元素，进行排序；
    * 2.将一个待排序的记录，插入到前面已经排好序的有序序列中去进行排序，直到所有元素插完为止。
    * */


    public  static int[] sort(int[] array){
        //j可以看做是已经排好序的序列的指针
        int j;
        //从下标为1（下标为0只有一个元素，默认有序）的元素开始选择合适的位置插入
        for(int i=1; i<array.length; i++){
            //记录要插入的元素
            int temp = array[i];
            j=i;


            //确定插入的位置j: 从已经排序的序列的最右边开始比较，找到其最小的数
            while(j >0 && temp<array[j-1]){
                //向后挪动
                array[j] = array[j-1];
                j--;
            }
            //插入j
            array[j] = temp;
        }
        return array;
    }


    public static void main(String[] args){
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过插入排序后的数组顺序为：");
        display(array);
    }

    //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


}

