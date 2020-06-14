package Year_2019_7_23.实验五作业;

public class homework8 {
    public static void main(String[] args) {
        int x = 10250910;
        int tmp = 0;
        int max=-1;
        while (x != 0) {
            if (x % 10 == 0)//判断最后一位是不是零
                tmp++;
            if(max<x%10)//判断最后一位数是否大于max？？
                max=x%10;
            x = x / 10;
        }
        System.out.println("零的个数为："+tmp+"个");
        System.out.println("最大数为："+max);
    }
}
