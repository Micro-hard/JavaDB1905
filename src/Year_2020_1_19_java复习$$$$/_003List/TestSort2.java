package Year_2020_1_19_java复习$$$$._003List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSort2 {
    public static void main(String[] args) {
        Student[] stus=new Student[]{new Student("james",18,100),
                new Student("andy",18,90),
                new Student("owen",19,98),
                new Student("adams",21,56),
                new Student("tiger",30,75)};
        //对这个数组的元素排序
        Arrays.sort(stus);  //没有实现comparable接口，不能排序
        System.out.println(Arrays.toString(stus));

        List<Student> list=new ArrayList<Student>();
        for (Student s:stus){
            list.add(s);
        }
        Collections.sort(list);//自然排序，内部比较器
        System.out.println(Arrays.toString(stus));

        Collections.sort(list,new MyStudentComparator());//第二种方法，传自定义的比较器，（实现comparator类里的compare方法）
        //Collections.reverse(list);
        System.out.println(list);
    }
}
