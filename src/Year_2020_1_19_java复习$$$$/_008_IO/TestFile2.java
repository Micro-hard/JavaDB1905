package Year_2020_1_19_java复习$$$$._008_IO;

import java.io.File;
import java.util.Arrays;

public class TestFile2 {//二分法查找
    /**
     *
     * @param array:源数组
     * @param start:起点
     * @param end:终点
     * @param value:值
     * @return  如果能找到，返回下标，找不到，返回-1；此方法要求数组是已经排序的
     */
    public static int binarySearch(int[] array,int start,int end,int value){//利用二分法查找，返回下标
        if(start==end){
            if(value==array[start]){
                return start;
            }else {
                return -1;
            }
        }
        //找出中间的下标
        int m=(start+end)>>1;//除2
        if(array[m]==value){
            return m;
        }else if(value<array[m]){
            return binarySearch(array,start,m-1,value);
        }else {
            return binarySearch(array,m+1,end,value);
        }
    }

    public static void delete(File file){//遍历树，递归删除文件
        //判断是否是目录
        if(file.isDirectory()){
            //遍历目录中每个文件，并递归调用自身
            for(File f:file.listFiles()){
                delete(f);
            }
        }
        System.out.println(file);
        //删除自己
        file.delete();
    }

    public static void main(String[] args) {
        int[] a={3,6,7,8,45,23,2456,46};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(binarySearch(a,0,a.length-1,7));
    }
}
