package Year_2019_7_23.数组作业;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9};
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要查找的数字:");
        int number=scanner.nextInt();
        for (int i=0;i<9;i++){
            if (number==array[i]) {
                System.out.println("此数组中有" + number + "数字");
                break;
            }
            else {
                System.out.println("此数组中没有" + number + "数字");
                break;
            }

        }
    }
}
