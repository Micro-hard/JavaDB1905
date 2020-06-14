package Year_2019_7_25_多态;

public class Person extends Object{
    public void method1(Person e){
        if(e instanceof Person){
            System.out.println(11);
        }
        if(e instanceof Student){
            System.out.println(22);
        }
    }

    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Student();//子类到父类自动转换
        p.method1(p1);
        //p.method1(p1);
    }
}
