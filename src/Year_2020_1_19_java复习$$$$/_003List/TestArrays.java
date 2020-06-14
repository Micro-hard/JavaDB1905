package Year_2020_1_19_java复习$$$$._003List;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("james","ok","owen");

        int[] is={3,5,7,8,9,5,6,8};
        int[] iis=Arrays.copyOf(is,2);//复制2之前的元素，不够补0
        System.out.println(Arrays.toString(iis));//3,5

        int[] iiis=Arrays.copyOfRange(is,2,5);
        System.out.println(Arrays.toString(iiis));//7,8,9
    }
}
