package Year_2020_1_19_java复习$$$$._011排序._04插入排序;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,4,5,6,3,2,1};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(Comparable[] a){
        //1   9 7 8 5 6 4   i从1开始，默认0是有序的，和有序的进行比较
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {        //往头挨个 比较
                if(greater(a[j-1], a[j])){//    j-1 大于j  就交换，如果不大直接推出即可
                    exch(a, j-1, j);
                }else {
                    break;
                }
            }
        }
    }

    //比较     v是否大于w
    private static boolean greater(Comparable v,Comparable w){
        return  v.compareTo(w)>0;
    }

    //交换
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
