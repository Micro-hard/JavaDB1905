package Year_2019_8_7_集合框架;

import java.util.ArrayList;

/**
 * 有序的   允许有重复元素的集合   允许有null值
 * ArrayList LinkedList是实现类
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList(20);
        ArrayList<String> list1=new ArrayList(20);
        ArrayList<String> list2=new ArrayList(20);
        ArrayList<Student> list3=new ArrayList(10);
        Student student1=new Student();
        Student student2=new Student();
        list.add(student1);
        list.add(student2);
        list3.add(new Student());
        list3.add(new Student());
        System.out.println(list.equals(list3));
        //list.addAll(list1);//把一个集合放到另一个集合里
        list1.add("abc");
        list1.add("abc");
        list2.add("abc");
        list2.add("abc");
        System.out.println(list.contains(new Student()));//有没有这个变量/对象//重写了equals
        System.out.println(list1.contains("abc"));
        list1.remove(1);

        Object []o=list3.toArray();//不能强转
        for (Object s:o){
            Student stu=(Student)s;
            System.out.println(stu.getName());
        }
        ArrayList<String> strlist=new ArrayList<>(30);//容量和size不是一个值   //默认是obje所以要加泛型
        strlist.add("a");
        strlist.add("b");
        strlist.add("c");
        strlist.add("d");
        strlist.add(1,"f");
        strlist.set(2,"u");
        for (String st:strlist){//推荐foreach
            System.out.println(st);
        }
        //System.out.println(strlist.get(1));//get里硬抛数组越界异常
        System.out.println("删除"+strlist.remove(1)+"成功");
        strlist.remove(2);


    }
}
