package Year_2019_8_8_集合框架stack_HashSet_TreeSet;

import Year_2019_8_7_集合框架.Student;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *       不能有重复的元素
 */
public class SetDemo {

    public static void work1(){
        int blue=0;
        blue=new Random().nextInt(33)+1;

        Set set=new HashSet();
        while(set.size()!=6){
            set.add(new Random().nextInt(36)+1);
        }
            System.out.println(set);
            System.out.println(blue);

    }

    public static void main(String[] args) {
        HashSet set=new HashSet();
        System.out.println("xxxx".hashCode());
        System.out.println("xxxx".hashCode());
        System.out.println("xxxx".hashCode());
        String str="xxx";
        String str1=str+"";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str==str1);
        set.add(new Student("4",45));
        set.add(new Student("4",45));
        set.add(new Student("4",45));
        set.add(new Student("4",45));
        System.out.println(set.size());
//        SetDemo.work1();
        Lottery l=new Lottery();
        System.out.println(l.getRed());
        System.out.println(l.getBlue());
        System.out.println(l.getMore(5));

        Student student1=new Student();
        Student student2=new Student();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("andy".hashCode());
        System.out.println("david".hashCode());
        System.out.println("lucy".hashCode());

        TreeSet tree=new TreeSet();        //自然排序
        tree.add("tom");
        tree.add("zoo");
        tree.add("david");
        tree.add("andy");
        System.out.println(tree);

        TreeSet tree1=new TreeSet();        //自然排序
        tree1.add(new Student("刘能",56));
        tree1.add(new Student("谢大脚",89));
        tree1.add(new Student("安召先",56));
        tree1.add(new Student("王小蒙",51));
        tree1.add(new Student("王长贵",34));
        tree1.iterator();//  返回迭代器
        System.out.println(tree1);

    }
}
