package Year_2019_7_23.第三节课;

import java.util.Scanner;

public class arraydemo {
    int i;
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        int array[] = {9, 2, 6, 4, 5};//声明一个数组
        int tmp;
        int tmp1;
        tmp = array[2];
        array[2] = array[0];
        array[0] = tmp;
        //System.out.println(array[0]+ " "+array[2]);
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (array[i] < array[j]) {
                    tmp1 = array[i];
                    array[i] = array[j];
                    array[j] = tmp1;
                }
        /*for (int x=0;x<array.length;x++)
            System.out.println(array[x]);*/
        for (int temp : array) {//遍历，没改变数组的值
            System.out.println(temp);
        }
    }
}
