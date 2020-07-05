package Year_2020_1_19_java复习$$$$._011排序;

import Year_2020_1_19_java复习$$$$._011排序._05希尔排序.Shell;
import Year_2020_1_19_java复习$$$$._011排序._06归并排序.Merge;
import Year_2020_1_19_java复习$$$$._011排序._07快速排序.Quick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestSort {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //创建缓存读取流
        //Class.getClassLoader.getResourceAsStream(String path) ：默认则是从ClassPath根下获取，path不能以’/'开头，最终是由ClassLoader获取资源。
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(TestSort.class.getClassLoader().getResourceAsStream("Year_2020_1_19_java复习$$$$/_011排序/reverse_arr.txt")));
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            int i= Integer.parseInt(line);
            list.add(i);
        }
        bufferedReader.close();

        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        //testShell(a);//20-30ms
        //testMerge(a);//50-90ms
        testQuick(a);
    }


    //测试快速排序
    public static void testQuick(Integer[] a){
        long start=System.currentTimeMillis();
        Quick.sort(a);
        long end=System.currentTimeMillis();
        System.out.println("快速排序耗时："+(end-start));
    }

    //测试归并排序
    public static void testMerge(Integer[] a){
        long start=System.currentTimeMillis();
        Merge.sort(a);
        long end=System.currentTimeMillis();
        System.out.println("归并排序耗时："+(end-start));
    }

    //测试希尔排序
    public static void testShell(Integer[] a){
        long start=System.currentTimeMillis();
        Shell.sort(a);
        long end=System.currentTimeMillis();
        System.out.println("希尔排序耗时："+(end-start));
    }

    //测试插入排序
    public static void testTInsertion(Integer[] a){
        long start=System.currentTimeMillis();
        Shell.sort(a);
        long end=System.currentTimeMillis();
        System.out.println("希尔排序耗时："+(end-start));
    }
}
