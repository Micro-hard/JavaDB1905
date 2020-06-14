package Year_2019_8_7_集合框架;

import java.util.Vector;

/**
 * 向量      不要记错，他是list接口下的
 * 线程安全的集合
 */
public class VectorDemo {///向量
    public static void main(String[] args) {
        Vector vs=new Vector();
        vs.add("abc");
        System.out.println(vs.get(0));
        vs.remove(0);
        System.out.println(vs);
        vs.remove("abc");
        System.out.println(vs);
    }
}
