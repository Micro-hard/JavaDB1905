package Year_2019_8_1_异常;

import Year_2019_7_31_接口.Employee;

public class ExceptionDemo {
    public void methoid1(){
        methoid2();
    }
    public void methoid2(){
        methoid3();
    }
    public void methoid3(){
        try{

        int i=10/0;
        }catch(Exception e){//捕获异常后，异常处理
            //             第一行一般写e.printStackTrace()
            System.out.println("出错的消息");
            e.printStackTrace();//打印栈的跟踪
        }
    }

    public static void main(String[] args) {
        new ExceptionDemo().methoid3();//当某行代码出错时，JVM会把调用类或者方法的先后顺序数出来，
        //这个叫错误栈，最上面的就是出崔那个类及行号
    }
}
