package Year_2019_7_23.第三节课;

import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] scores=new int[5];
        int tmp1;
        for (int i=0;i<scores.length;i++){
            System.out.println("这是第"+(i+1)+"个元素的值");
            scores[i]=scanner.nextInt();
        }
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++) {
                if (scores[j] > scores[j+1]) {
                    tmp1 = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp1;
                }
                /*if (scores[j] < scores[j+1]) {
                    tmp1 = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp1;
                }*/
                //if()
            }
        for (int temp : scores) {//遍历，没改变数组的值
            System.out.println(temp);
        }
    }
}
