package algorithms.tenbase.shell;

import datastructures.Array;

import java.util.Arrays;

public class ShellSort {
    //希尔排序kunth间隔序列为3h+1
    public static void shellKnuthSort(int[] array){
        System.out.println("原始数组"+ Arrays.toString(array));
        int step = 1;
        int len = array.length;
        while (step <= len/3){
            step = step*3+1;//1,4,13,40
        }
        while (step > 0){
            //分别对每个增量间隔进行排序
            for(int i = step; i < len; i++){
                int temp = array[i];
                int j = i;
                while (j > step-1 && temp <= array[j-step]){
                    array[j] = array[j-step];
                    j -=step;
                }
                array[j] = temp;
            }

            System.out.println("间隔为"+step+"的排序结果为"+Arrays.toString(array));
            step = (step -1)/3;
        }
        System.out.println("最终的排序结果为"+Arrays.toString(array));
    }


    //希尔排序 间隔为2h
    public static void shellSort(int[] array){
        System.out.println("原数组为"+Arrays.toString(array));
        int step;
        int len = array.length;
        for(step = len/2 ;step > 0 ; step /= 2){
            //分别对每个增量间隔进行排序
            for(int i = step ; i < array.length ; i++){
                int j = i;
                int temp = array[j];
                if(array[j] < array[j-step]){
                    while(j-step >=0 && temp < array[j-step]){
                        array[j] = array[j-step];
                        j -= step;
                    }
                    array[j] = temp;
                }
            }
            System.out.println("间隔为"+step+"的排序结果为"+Arrays.toString(array));
        }
    }



    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3,10};
        shellKnuthSort(array);
    }

}
