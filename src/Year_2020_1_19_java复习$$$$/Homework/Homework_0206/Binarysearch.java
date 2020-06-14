package Year_2020_1_19_java复习$$$$.Homework.Homework_0206;

import java.util.Arrays;

public class Binarysearch {

    //二分法查找

    /**
     *
     * @param array 原始数组
     * @param start 起点
     * @param end 终点
     * @param value 值
     * @return 找到返回下标，找不到返回-1
     */
    public static int binarySearch(int[] array,int start,int end,int value){
        if(start==end){
            if(array[start]!=value){  //数组中不含有value
                return -1;
            }
        }

        int middle=0;//起点和终点的中间值
        middle=(start+end)>>1;//除以2

        if(array[middle]==value){
            return middle;
        }else if(array[middle]>value){//如果中间值大于给定值，则在start~middle-1中继续找
            return binarySearch(array,start,middle-1,value);
        }else {   //如果中间值小于给定值，则在middle+1~end中继续找
            return binarySearch(array,middle+1,end,value);
        }
    }

    public static void main(String[] args) {
        int[] i={5,8,9,1,2,0,202,-1};
        Arrays.sort(i);//对数组进行排序
        System.out.println(Arrays.toString(i));

        System.out.println("下标："+binarySearch(i,0,i.length-1,5));
    }
}
