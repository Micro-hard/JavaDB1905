package Year_2019_7_23.第四节课oop;

import java.text.DecimalFormat;

public class Mathclass {
    //保留两位小数
    public String precisionTwo(double num){
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(num);
    }
    public int findPrime(int num[]){    //找出素数
        int tmp=0;
        int j=0;
        for (int i=0;i<num.length;i++) {
            boolean isSu=true;
            for (j = 2; j < num[i]; j++)
                if(num[i]%j==0) {
                    isSu = false;
                    break;
                }
                if(isSu)
                    tmp++;

        }
            return tmp;
    }

    public static void main(String[] args) {
        Mathclass m = new Mathclass();
        System.out.println(m.precisionTwo(1234.4567));
        int []array={3,4,5,6,8,9,10};
        System.out.println(m.findPrime(array));
    }
}
