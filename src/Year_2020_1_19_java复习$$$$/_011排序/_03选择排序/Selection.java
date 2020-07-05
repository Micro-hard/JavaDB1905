package Year_2020_1_19_java复习$$$$._011排序._03选择排序;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,4,5,6,3,2,1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Comparable[] a){

        //剩最后一个不用比了,已经有序了哦
        for (int i = 0; i < a.length-1; i++) {
            int minIndex=i;
            //注意j的值！！！！！！！！！！
            for (int j = i+1; j < a.length; j++) {
                if(greater(a[minIndex], a[j])){
                    minIndex=j;
                }
            }
            exch(a, i, minIndex);
        }
    }

    private static boolean greater(Comparable v,Comparable w){
        return  v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
