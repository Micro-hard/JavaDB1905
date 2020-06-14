package Year_2019_7_23.第四节课oop;

import java.util.Arrays;

public class morenzhi {
    byte h;
    short g;
    int a;
    char b;
    float c;
    double d;
    String e;
    boolean f;
    int []i;

    @Override
    public String toString() {
        return "morenzhi{" +
                "h=" + h +
                ", g=" + g +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e='" + e + '\'' +
                ", f=" + f +
                ", i=" + Arrays.toString(i) +
                '}';
    }

    public static void main(String[] args) {
        morenzhi a = new morenzhi();
        System.out.println(a.toString());
//        System.out.println(a.a);
//        System.out.println(a.b);
//        System.out.println(a.c);
//        System.out.println(a.d);
//        System.out.println(a.e);
//        System.out.println(a.f);
    }
}
