package Year_2019_7_23.数组作业;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        int [] array=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入十个数：");
        for (int i=0;i<10;i++){
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for (int i=0;i<10;i++){
            if(max<array[i])
                max=array[i];
        }
        for (int i=0;i<10;i++){
            if(min>array[i])
                min=array[i];
        }
        System.out.println("最大数："+max+"最小数："+min+"最大和最小平均值为："+(max+min)/2);
    }
}
