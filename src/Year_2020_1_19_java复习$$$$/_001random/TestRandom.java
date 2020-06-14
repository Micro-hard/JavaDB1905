package Year_2020_1_19_java复习$$$$._001random;

import java.util.Arrays;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r=new Random();

        System.out.println(r.nextBoolean());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
        System.out.println(r.nextInt());
        System.out.println(r.nextInt());

        for (int i=0;i<10;i++){
            System.out.println(r.nextInt(100)); //100以内的随机数
        }

        byte[] b=new byte[10];
        r.nextBytes(b);
        System.out.println(Arrays.toString(b));

    }
}
