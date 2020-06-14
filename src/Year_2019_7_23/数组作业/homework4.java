package Year_2019_7_23.数组作业;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        int [] array=new int[10];
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入十个数：");
        for (int i=0;i<10;i++){
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        for (int i=0;i<10;i++){
            if(max<array[i])
                max=array[i];
        }
        for (int i=0;i<10;i++){
            if(max==array[i])
                System.out.println("最大值在数组中的位置为："+i);
        }

    }
}
