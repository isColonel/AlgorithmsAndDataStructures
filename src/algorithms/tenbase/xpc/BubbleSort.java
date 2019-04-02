package algorithms.tenbase.xpc;

public class BubbleSort {

    /*
    * 冒泡算法的运行规律：
    * 1.比较相邻的两个元素，较大者置于后者；
    * 2.对每一轮的相邻元素进行同样的工作，直到最后一对。这一轮结束之后，待排序序列的最大元素为最后一个元素。
    * 3.此时待排序序列长度n-1;重复1,2操作。（也就是需要比较n-1轮）
    * */

    public static int[] sort(int[] array){
        //这里的for循环表示总共需要多少轮
        for(int i=1; i<array.length; i++){
            //设定一个标记，如果为true则表示没有发生交换（也就是说排序结束）
            boolean flag = true;
            //这里的for循环表示每次参与比较元素的下标；对array[0,1,2...length-1]进行排序；j的范围为length-1
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag =false;
                }
            }
            if(flag){
                break;
            }

            //第 i轮排序的结果为
            System.out.print("第"+i+"轮排序后的结果为:");
            display(array);
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {2,4,6,23,5,3,7,245,565};
        System.out.println("待排序的数组为");
        display(array);
        System.out.println("排序之后数组为");
        sort(array);
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
