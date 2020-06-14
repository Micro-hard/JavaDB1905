package Year_2019_7_23.第二节课;
public class test1 {
    public static void main(String[] args) {
        int a = 123123;
        int i=0;
        if (a == 0) {
            i = 1;
            System.out.println("这个数有"+i+"位");
            System.exit(0);
        }
        /*for (i = 0; a != 0; ) {
                a /= 10;
                ++i;
        }*/
        while(a!=0) {
            i++;
            a/=10;
        }
        System.out.println("这个数有"+i+"位");
    }
}
