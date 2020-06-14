package Year_2019_7_23.实验五作业;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int tmp = scanner.nextInt();
        boolean isSu = true;
        for (int i = 2; i < tmp; i++) {
            if (tmp % i == 0) {
                isSu = false;
                //break;
            }
        }
        if (isSu) {
            System.out.println("是素数");
            System.exit(0);
        } else {
            System.out.println("不是素数");
            System.exit(0);
        }

    }
}

