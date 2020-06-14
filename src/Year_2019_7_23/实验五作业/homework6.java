package Year_2019_7_23.实验五作业;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int tmp=scanner.nextInt();
        for (int i=1;i<tmp;i++){
            if(tmp%i==0)
                System.out.println(" "+i+" ");
        }
    }
}
