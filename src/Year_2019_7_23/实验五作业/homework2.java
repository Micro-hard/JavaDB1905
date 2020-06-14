package Year_2019_7_23.实验五作业;

import java.text.DecimalFormat;

public class homework2 {
    public static void main(String[] args) {
        double sum=10000;
        for(int i=0;i<5;i++){
            sum=sum+sum*0.003;
        }
        //这个类是为了规定数字小数位数
        DecimalFormat df=new DecimalFormat(".###");
        System.out.println(df.format(sum));
        System.out.println("本金"+sum);
    }
}
