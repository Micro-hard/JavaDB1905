package Year_2019_7_31_接口.作业;

import java.util.Arrays;

public class Compute implements StudentFunction {
    private Student[] arrays;
    public int size;
    private final int extend_capacity = 10;  //final

    public Compute() {
        arrays = new Student[10];
//        for(int i=0;i<10;i++){
//            arrays[i]=new Student();
//        }
    }

    public void add(Student student) {
        if (size == extend_capacity)
            extend();
        arrays[size++] = student;
    }

    public void extend() {
        Student[] arraysnew = Arrays.copyOf(arrays, size + extend_capacity);//扩展容量
        arrays = arraysnew;
    }

    public boolean remove() {//尾部删除一个学生
        this.arrays[size - 1] = null;
        size--;
        return true;
    }

    public Student[] getArrays() {

        return arrays;
    }

    @Override
    public void sort() {
        Compute compute=new Compute();
        Student tmp;
        int k;
        for (int i = 0; i < arrays.length&&arrays[i]!=null; i++) {
            //System.out.println("1111111111");
            for(k = 0; k < arrays.length&&arrays[k]!=null; k++);
            k--;
            for (int j = k-1; j >= i; j--) {
                if (arrays[j].getGrade() < arrays[j+1].getGrade()) {
                    tmp = arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=tmp;
                }
            }
        }
    }

    @Override
    public void disp() {
        Compute compute=new Compute();
        for (int i=0;i<arrays.length;i++){
            if (i<arrays.length*0.7&&arrays[i]!=null)
            System.out.println(arrays[i].getGrade()+"PASS");
            else
            System.out.println(arrays[i].getGrade()+"FAIL");
        }
    }

    public static void main(String[] args) {
         Compute compute=new Compute();
         compute.add(new Student("1",100));
         compute.add(new Student("2",20));
         compute.add(new Student("3",100));
         compute.add(new Student("3",50));
         compute.add(new Student("3",9));
         compute.add(new Student("3",6));
         compute.add(new Student("4",30));
         compute.add(new Student("4",30));
         compute.add(new Student("4",30));
         compute.add(new Student("4",30));
         compute.sort();
         compute.disp();
    }
}
