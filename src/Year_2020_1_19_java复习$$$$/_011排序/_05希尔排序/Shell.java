package Year_2020_1_19_java复习$$$$._011排序._05希尔排序;

import java.util.Arrays;

//插入排序的升级 ，  不需要一次一次的交换了，而是一次性可以往前很多的位置进行交换！！！！！
public class Shell {

    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,8,8,4,5,6,3,2,1};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Comparable[] a){
        //确定增长量 h的初始值！！！       1  3  7  ...
        int h=1;
        while(h<a.length){
            h=2*h+1;     //规定的    公式！！！！！！！！！！！！！！！！！！！！！！
        }

        //排序
        while(h>=1){
            //找到待插入的元素
            //System.out.println("h"+h);

            //这就是插入排序
            for(int i=h;i<a.length;i++){    //h最后会变为1
                //元素放到有序数组中；
                for (int j = i; j >=h; j-=h) {   //每一次找都是往前减h   j>=h下面不会越界，！！！！！
                    if(greater(a[j-h], a[j])){
                        exch(a, j-h, j);
                    }else {
                        break;
                    }
                }
            }
            //减小h的值
            h/=2;
            //System.out.println("h:"+h);
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
