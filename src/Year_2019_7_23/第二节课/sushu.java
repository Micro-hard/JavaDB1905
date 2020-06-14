package Year_2019_7_23.第二节课;

import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {
        int j,tmp=0;
        for(int i=1;i<=1000;i++) {
            for (j = 2; j < i && i % j != 0; j++)
                ;

            if (i == j) {
                tmp++;
                System.out.printf("%-4d", i);
                if (tmp == 10) {
                    System.out.println();
                    tmp = 0;
                }
            }
        }
    }
}
