package Year_2019_7_31_接口;

public class TestInterface {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(9);
        ComparableCircle c2=new ComparableCircle(8);
        CompareOblectRectangle c3=new ComparableRectangle(5,5);
        CompareOblectRectangle c4=new ComparableRectangle(6,6);
        System.out.println(c1.compareTo(c2)>=0?(c1.compareTo(c2)>0?"大于":"等于"):"小于");
        System.out.println(c3.compareTo(c4)>=0?(c3.compareTo(c4)>0?"大于":"等于"):"小于");

    }
}
