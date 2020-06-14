package Year_2019_8_1_异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 为什么要用异常 {
    public static void main(String[] args) {
        //当你输入字母，因为nextint只能接受数字
        //程序出错异常，中止
        //异常捕获的目的就是有错，程序也能执行
        int i =0,j=1;
        while(true&&j<=5) {
            try {
                System.out.println("第"+j+"次");
                Scanner scanner1=new Scanner(System.in);
                System.out.println("请输入一个数字");
                i = scanner1.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("你是不是瞎？让你输入数字再给我输入一遍：");
            } finally {
                System.out.println("初步出错都执行");
            }
            j++;
        }
        System.out.println("您输入的是："+i);
        System.out.println("程序结束！");
        try {
            FileInputStream file=new FileInputStream("c:xx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件没找到!!!");
        }
    }
}
