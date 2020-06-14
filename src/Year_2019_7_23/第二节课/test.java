package Year_2019_7_23.第二节课;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean issuccess = false;
        int num = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(num);
        System.out.println("输入数字");
        int i = 0;
        while (i < 6) {
            i++;
            int a = scanner.nextInt();
            if (a == num) {
                System.out.println("这是你第" + i + "次猜" + "嘿嘿你真棒！！");
                issuccess=true;
                System.exit(0);
            } else if (a > num) {
                System.out.println("这是你第" + i + "次猜" + "大了");
            } else {
                System.out.println("这是你第" + i + "次猜" + "小了");
            }
        }
        if(issuccess)
            System.out.println("嘿嘿你真棒");
        else{
            System.out.println("five");
        }
        System.exit(0);
    }
}
