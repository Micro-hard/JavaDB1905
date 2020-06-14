package Year_2019_7_23.数组作业;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int [] array=new int [5];
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入五个数");
        for (int i=0;i<5;i++){
            array[i]=scanner.nextInt();
        }
        for (int i=4;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
