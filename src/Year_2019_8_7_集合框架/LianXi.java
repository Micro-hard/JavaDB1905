package Year_2019_8_7_集合框架;

import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.WhileNode;

import java.lang.reflect.Array;
import java.util.*;

public class LianXi {
    public static void main(String[] args) {
        Integer array[]={3,2,1,4,5,9,8,7,6,10};
        Arrays.sort(array);

        List lis=Arrays.asList(array);//   数组转集合

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <10; i++) {
            arrayList.add(array[i]);
        }

        for (int i = 0; i <10; i++) {
            System.out.println(arrayList.get(i));
        }
        //List
        //对集合的头部和尾部操作效率高
        LinkedList llist=new LinkedList();
        llist.addFirst("news:香港暴乱");
        llist.addFirst("news:人民币贬值");
        llist.addFirst("news:李贤");
        llist.removeFirst();
        llist.addLast("news:邓论");
        llist.addLast("news:虚鲲");
        System.out.println(llist.get(0));
        Iterator it=llist.iterator();//返回一个迭代器对象
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //这种迭代器能往前previous  又能往后next
        ListIterator lit=llist.listIterator();
        lit.next();
        lit.next();
        lit.next();
        lit.previous();
        System.out.println(lit.next());

        ArrayList<Integer> monkey=new ArrayList<>();
        for (int i=1;i<=15;i++){
            monkey.add(i);
        }
        ListIterator iterator=monkey.listIterator();
        /*while (monkey.size()>1){
            if (){//如果被7整出
                iterator.remove();
            }
        }*/




       // LianXi.w2();
       // LianXi.w3();
       // LianXi.w4();
    }
    public static void w2(){
        String s="科特迪瓦,阿根廷,澳大利亚,塞尔维亚,荷兰,尼日利亚,日本,美国,中国, 新西兰,巴西,比利时,韩国,喀麦隆,洪都拉斯,意大利";
        String[] s1=s.split(",");
        List l=Arrays.asList(s1);              //   数组转集合
        Collections.shuffle(l);/////打乱集合
        int j=0;
        for (int i=0;i<s1.length;i++){
            if (i%4==0) {
                j++;
                System.out.println("\n"+"第" + j + "组");
            }
            System.out.print(l.get(i)+" ");
        }
    }
    public static void w3(){
        int [] a=new int [15];
        List arrayList=new ArrayList();
        for (int i=0;i<15;i++) {
            a[i] = i + 1;
            arrayList.add(a[i]);
        }
        //System.out.println(arrayList.size());
        int n=0;
//        for (int i=0;i<a.length-1;i++){
//            n=(n+6)%(arrayList.size());
//            arrayList.remove(n);
//        }

        while(arrayList.size()!=1){
            for (int i=0;i<7;i++){
                if (n==arrayList.size()){
                    n=0;
                }
                if (i==6){
                    arrayList.remove(n);
                }else {
                    n++;
                }
            }
        }
        System.out.println(arrayList);
    }
    public static void w4(){
        ArrayList<Integer> l=new ArrayList();
        for (int i=1;i<=10;i++)
            if (i%2==0)
                l.add(i);
        System.out.println(l);
        ArrayList<Student> students=new ArrayList<>(10);
        double max=0;
        students.add(new Student("秀琴",50));
        students.add(new Student("秀琴",80));
        students.add(new Student("秀琴",60));
        students.add(new Student("秀琴",30));
        students.add(new Student("秀琴",20));
        students.add(new Student("秀琴",40));
        students.add(new Student("秀琴",50));
        students.add(new Student("秀琴",40));
        students.add(new Student("秀琴",60));
        students.add(new Student("秀琴",90));
        for (int i=0;i<students.size();i++){
            if (students.get(i).getScore()>max){
                max=students.get(i).getScore();
            }
            if (students.get(i).getScore()<60){
                students.remove(i--);////这里容易有bug   remove后数组自动窜  少判断了
            }
        }
        System.out.println(max);
    }
}