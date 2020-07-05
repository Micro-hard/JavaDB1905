package Year_2020_1_19_java复习$$$$._011排序._07快速排序;

import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,8,8,4,5,6,3,2,1};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //比较     v是否小于w      ！！！小于了，！！！
    private static boolean less(Comparable v,Comparable w){
        return  v.compareTo(w)<0;
    }

    //交换
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public static void sort(Comparable[] a){
        int lo=0;
        int hi=a.length-1;
        sort(a, lo, hi);
    }

    public static void sort(Comparable[] a,int lo ,int hi){
        if(lo>=hi){
            return;
        }

        //lo索引到hi索引进行 分组！！！！      左子组  右子组          ！！！
        int partition=partition(a, lo, hi);//返回的是分组的分界值所在的索引,  分解值位置变换后的索引

        sort(a,lo,partition-1);  //不需要对  分界值排序了
        sort(a,partition+1,hi);  //不需要对  分界值排序了
    }


    //对元素进行分组
    public static int partition(Comparable[] a,int lo,int hi){
        //分界值！！！！！！！！！！！！！！！！！！！！！！！
        Comparable key=a[lo];

        int left=lo;
        int right=hi+1;

        while(true){
            //先从右往左  找到比分界值小的元素
            while(less(key, a[--right])){
                if(right==lo){
                    break;
                }
            }
            //在从左往右  找到比分界值大的元素
            while(less(a[++left],key)){
                if(left==hi){
                    break;
                }
            }
            //判断left>=right，true，扫描完毕，false，交换元素
            if(left>=right){
                break;
            }else {
                exch(a, left, right);   //大的是left，小的是right，交换！！！
            }
        }
        //交换分界值   规定   ！！！
        exch(a, lo, right);
        //返回分界值
        return right;
    }
}
