package test002;
import java.util.*;
public class Test002 {
    public static boolean heFa(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                continue;
            }else{
                System.out.println("符号不合法");
                return false;
            }
        }
        if(str.length()==10){
            if(str.charAt(3)=='1'||str.charAt(3)=='0'){
                System.out.println("前缀码0或1开头");
                return false;
            }
        }else if(str.length()==7){
            if(str.charAt(0)=='1'||str.charAt(0)=='0'){
                System.out.println("前缀码0或1开头");
                return false;
            }
        }else{
            System.out.println("长度错误");
            return false;
        }
        return true;
    }
    public static void main(String []aras){
        String input=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入电话号码：");
        input=scanner.next();
        System.out.println(heFa(input)?"合法":"不合法");
    }
}
