package Year_2020_1_19_java复习$$$$._003List;

import java.util.Comparator;

public class MyStudentComparator implements Comparator<Student> {   //外部比较器
    @Override
    public int compare(Student o1, Student o2) {  //重写compare方法
        return o1.getScore()-o2.getScore();
    }
}
