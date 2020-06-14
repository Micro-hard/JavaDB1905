package Year_2019_7_23.实验五作业;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        int[] score = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入分数：");
            score[i] = scanner.nextInt();
            if (score[i] < 0) {
                System.out.println("error");
                break;
            }

        }
        for (int i=0;i<5;i++)
            System.out.println(score[i]);

    }
}
