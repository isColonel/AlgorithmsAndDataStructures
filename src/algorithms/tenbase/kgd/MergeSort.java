package algorithms.tenbase.kgd;

public class MergeSort {
    //非递归算法为
    public static int[] sort(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        int aNum = 0,bNum = 0, cNum =0;
        while (aNum<a.length && bNum <b.length){
            //比较数组a和数组b的元素，谁更小将谁赋值到c数组
            if (a[aNum] >= b[bNum]){
                c[cNum++] = b[bNum++];
            }else {
                c[cNum++] = a[aNum++];
            }
        }
        //如果数组a全部赋值到数组c了，但是b数组还有元素，则将b数组剩余的元素按照顺序全部赋值到c数组
        while(aNum == a.length && bNum < b.length){
            c[cNum++] = b[bNum++];
        }
        //如果数组b全部赋值到数组c了，但数组a还有元素，则将a数组剩余的元素按照顺序全部赋值到c数组
        while (bNum == b.length && aNum < a.length){
            c[cNum++] = a[aNum++];
        }
        return c;
    }

    //测试
    public static void main(String[] args) {
        int[] arrayC ;
        int[] arrayA = {2,4,6,8};
        int[] arrayB = {1,3,5,7,9};
        arrayC = sort(arrayA,arrayB);
        for (int i : arrayC) {
            System.out.print(i + " ");
        }
    }

}
