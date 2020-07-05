package Year_2020_1_19_java复习$$$$._011排序._06归并排序;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1,8,8,4,5,6,3,2,1};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //辅助数组
    private static Comparable[] assist;

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
        //初始化辅助数组
        assist=new Comparable[a.length];
        //定义一个lo和hi变量，
        int lo=0;
        int hi=a.length-1;
        //调用重载  ,对所有元素排序
        sort(a, lo, hi);
    }

    public static void sort(Comparable[] a,int lo,int hi){
        //安全校验
        if(lo>=hi){
            return;
        }
        //
        //int mid=lo+(hi-lo)/2;
        int mid=(hi+lo)/2;

        sort(a,lo,mid);
        sort(a,mid+1,hi);

        merge(a, lo, mid, hi);
    }

    //归并+排序lo         mid          hi
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        //定义三个指针
        int i=lo;
        int p1=lo;
        int p2=mid+1;

        //     重点在于三个指针的移动问题！！！！！！！！！！！！！！！！！！！！！！！

        //遍历 移动p1指针和p2指针
        while (p1<=mid && p2<=hi){
            //比较
            if(less(a[p1],a[p2] )){
                assist[i++]=a[p1++];   //放小的，指针后移
            }else {
                assist[i++]=a[p2++];   //放小的，指针后移
            }
        }  //某个自组中的元素已经全部放到临时 数组中了

        //把其中一个剩下的子组的元素加到临时数组中
        while (p1<=mid){
            assist[i++]=a[p1++];
        }
        while (p2<=hi){
            assist[i++]=a[p2++];
        }

        //临时数组中的元素拷贝到原数组
        for(int index=lo;index<=hi;index++){
            a[index]=assist[index];
        }
    }
}
