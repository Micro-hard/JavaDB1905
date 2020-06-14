package Year_2019_8_9_集合作业;

import java.util.ArrayList;
import java.util.List;

public class homeWork13 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        double tmp=0;
        double tmp1=0;
        double tmp2=0;
        double tmp3=0;
        int i1=0;
        int i2=0;
        int i3=0;
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30, 80, "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));
        for (int i = 0; i < list.toArray().length; i++) {
            tmp+=list.get(i).getAge();
        }
        System.out.println("平均年龄："+tmp/list.toArray().length);
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i).getClassNum().equals("class04")){
                 tmp1+=list.get(i).getAge();
                 i1++;
            }
            if (list.get(i).getClassNum().equals("class05")){
                tmp2+=list.get(i).getAge();
                i2++;
            }
            if (list.get(i).getClassNum().equals("class06")){
                tmp3+=list.get(i).getAge();
                i3++;
            }
        }
        System.out.println("class04总分:"+tmp1+"平均分："+tmp1/i1);
        System.out.println("class05总分:"+tmp2+"平均分："+tmp2/i2);
        System.out.println("class06总分:"+tmp3+"平均分："+tmp3/i3);
    }

}
