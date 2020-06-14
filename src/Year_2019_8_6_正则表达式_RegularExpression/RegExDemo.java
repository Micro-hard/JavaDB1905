package Year_2019_8_6_正则表达式_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public void s(int a,double b){

    }
    public void s(double a,int b){

    }
    public static void main(String[] args) {



        //Pattern.CASE_INSENSITIVE  大小写不敏感
        //String regexp= "a*b";
        //String regexp= "^1\\d{10}";//验证手机号是否正确
        //String regexp= "[0-9]{17}[x0-9]";//验证身份证号是否正确
        //String regexp= "黑A\\w{5}";//验证车牌号是否正确
        //String province="黑吉辽";
        //String regexp= String.format("[%s]A[A-Z0-9]{5}",province);//验证车牌号是否正确
        String regexp="[a-z0-9-]+\\.?[a-z0-9-]+@[a-z0-9]{2,}\\.(com|org|cn|net)(\\.cn|com\\.cn)?";
        //String regexp1="([a-z0-9-]*\\.?[a-z0-9-])*@[a-z0-9]{2,3}.*";
        Pattern p=Pattern.compile(regexp,Pattern.CASE_INSENSITIVE);//正则表达式就得有这三行
        Matcher m=p.matcher("114661295@qq.com");
        boolean b=m.matches();
        System.out.println(b);
        String html="<!DOCTYPE html>ss" +
                "<html lang=\"en\">ss" +
                "<head>ss" +
                "    <meta charset=\"UTF-8\">ss" +
                "    <title>Title</title>ss" +
                "</head>ss" +
                "<body>ss" +
                "    <input type=\"checkbox\">ss" +
                "</body>ss" +
                "</html>";
    }
}
