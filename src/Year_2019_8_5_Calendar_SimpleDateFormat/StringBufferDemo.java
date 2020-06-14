package Year_2019_8_5_Calendar_SimpleDateFormat;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sbstr=new StringBuffer("abc");
        sbstr.append("efg");       //追加
        sbstr.insert(0,"123");     //插入
        System.out.println(sbstr.toString().equals("123abcefg"));
        StringBuilder sbb=new StringBuilder();
        System.out.println(sbb.equals(""));
        String a=new String();

    }
}
