package Year_2019_7_23.实验五作业;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int tmp = scanner.nextInt();
        int sum=0;
        for(int i=1;i<tmp;i++){
            if(tmp%i==0){
                sum+=i;
            }
        }
        if(tmp==sum)
            System.out.println("是完全数");
        else
            System.out.println("嘿嘿你真棒！！！");

    }
}
