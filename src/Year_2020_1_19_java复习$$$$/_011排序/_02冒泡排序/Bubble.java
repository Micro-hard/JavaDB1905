package Year_2020_1_19_java复习$$$$._011排序._02冒泡排序;

import java.util.Arrays;

public class Bubble {
    //包装类实现了Comparable接口！！！！！！！！！！！！
    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,4,5,6,3,2,1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(Comparable[] a){
        //标志，如果已经有序（没发生交换），直接返回；
        int flag=0;

        //从前往后
        int m=a.length-1;
        //从后往前
        int n=0;
        //临时变量
        int temp1=0;
        int temp2=0;
        for(int i=0;i<a.length-1;i++){
            for (int j = n; j < m; j++) {
                if(greater(a[j], a[j+1])){
                    exch(a, j, j+1);
                    //加入标记
                    flag=1;
                    //交换元素，记录最后一次交换的位置,j后面的已经有序了
                    temp1=j;
                }
            }
            //没发生交换
            if(flag==0){
                return;
            }
            //下一次比较到记录位置即可
            m=temp1;

            //反向寻找最小值！！！！！！！！！！！！！！！！！！！！！！！！！！！！
            for(int k=m;k>n;k--){
                if(greater(a[k-1], a[k])){
                    exch(a, k-1, k);
                    //加入标记
                    flag=1;
                    temp2=k;
                }
            }
            if(flag==0){
                return;
            }
            n=temp2;
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
