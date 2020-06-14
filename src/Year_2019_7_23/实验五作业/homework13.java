package Year_2019_7_23.实验五作业;

import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
        int [] score=new int[10];
        Scanner scanner =new Scanner(System.in);
        double tmp=0;
        for(int i=0;i<10;i++){
            System.out.println("输入分数：");
            score[i]=scanner.nextInt();
            if(score[i]<80)
                continue;
            tmp++;
        }
        System.out.println("比例为"+tmp/10);
    }
}
