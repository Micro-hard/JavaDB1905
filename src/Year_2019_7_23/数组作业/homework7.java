package Year_2019_7_23.数组作业;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner scanner =new Scanner(System.in);
        int sum=0;
        System.out.println("请输入10个数：");
        for (int i=0;i<10;i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        double average=sum/10;
        System.out.println("平均值为："+average);
    }
}
