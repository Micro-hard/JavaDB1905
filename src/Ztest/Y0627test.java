package Ztest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Y0627test {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=1;i<list.size()+1;i++){
            if(list.contains(i)){
                System.out.println(i);
                continue;
            }
            System.out.println(i);

        }
        System.out.println("test");
    }
}
