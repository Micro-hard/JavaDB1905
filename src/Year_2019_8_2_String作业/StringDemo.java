package Year_2019_8_2_String作业;

import Year_2019_7_26多态作业.Array;

import java.util.Arrays;

public class StringDemo {
    public void Work1() {
        String string = "this is a test of java";
        int tmp = 0;
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == 's')
                tmp++;
        System.out.println(tmp);                  /////001

        System.out.println((string.substring(10)).substring(0, 4));////002

        char[] str;
        str = string.toCharArray();
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
        for (int i = 0; i < string.length(); i++) {
            str[i] = string.charAt(i);
            System.out.print(str[i]);
        }                                 /////003
        String[] str1 = string.split(" ");
        for (int i = 0; i < str1.length; i++) {
            str1[i] = (str1[i].charAt(0) + "").toUpperCase() + str1[i].substring(1);////****/////*****/////
            System.out.println(str1[i]);
        }                                     /////////004api包里的DanCi

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        System.out.println(stringBuffer + "111");/////////005
        String[] str001 = string.split(" ");
//        for (String ss:str001
//             ) {
//            System.out.println(ss);
//        }
        for (int i = 0; i < str001.length; i++) {
            System.out.println(str001[i] + "====");
        }//////////006
    }

    public static void printCharInfo(String str) {//          作业一.6
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int index = 0;
            int count = 0;
            while ((index = str.indexOf(c[i], index)) != -1) {
                count++;
                index++;
            }
            if (str.indexOf(c[i], i + 1) == -1) {
                System.out.println(c[i] + ":" + count + "个");
            }
        }
    }

    public static void printCharInfo1(String str) {//          作业一.6
        while(str.length()!=0){
            char c=str.charAt(0);
            String n=str.replace(c+"","");//空字符
            System.out.println(c+":"+(str.length()-n.length()));
            str=n;
        }
    }

    public String rtrim(String str) {//          作业一.7
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) ==' ')
                str = str.substring(0, i);
            else break;
        }
        return str;
    }

    public static String concat(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
        }
        return str;
    }//////作业一.8

    public static String moveToRight(String str, int position) {
        int tmp = position % str.length();//真正移动多少
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if (i < tmp) {
                str1[i] = str.charAt(i + str.length() - tmp);
            } else
                str1[i] = str.charAt(i - tmp);
        }

        str = String.valueOf(str1);///字符数组转成字符串
        return str;
    }//////作业一.9

    public static void maxLength(String[] str) {
        int maxLength = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > str[maxLength].length())
                maxLength = i;
        }
        System.out.println(str[maxLength]);
        System.out.println(1010101010);
    }          ///作业作业一.10

    public static int stringAt(String str, String subStr) {
        return str.toLowerCase().indexOf(subStr.toLowerCase());
    }           ///作业作业一.11

    public static boolean huiWen(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1))
                return true;
            else
                return false;
        }
        return false;
    }    ///作业作业一.12

    public static void Analysis(String string) {
        String[] str1;
        int sum = 0;
        str1 = string.split("-");
        for (int i = 0; i < str1.length; i++) {
            String[] str2 = str1[i].split("#");
            for (int j = 0; j < str2.length; j++) {
                System.out.print(str2[j] + " ");
            }
            System.out.println();
            sum += Integer.parseInt(str2[2]);
        }
        System.out.println("总分：" + sum);
    } ///作业作业一.13

    public static void getString() {
        String str = "abkkcdkkefkkskkskk";
        int tmp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("kk") < str.length() - 2) {
                str = str.replaceFirst("kk", "");
                tmp++;
            } else break;
        }
        System.out.println("kk出现次数：" + tmp);
    }//////////作业二.2

    public static String trim(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(0) == ' ')
                str = str.substring(0);
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                //System.out.println(str);
                str = str.substring(0, i);
            } else break;
        }
        return str;
    }//////////作业二.3

    public static void replaceString(String str, int start, int end) {
        char[] str1 = str.toCharArray();
        int ii = 0;
        start--;
        end--;
        for (int i = start; i <= start + (end - start) / 2; i++) {
            char tmp = ' ';
            tmp = str1[str.length() - (str.length() - end) - ii];
            str1[str.length() - (str.length() - end) - ii] = str1[i];
            str1[i] = tmp;
            ii++;
        }
        str = String.valueOf(str1);
        System.out.println(str);
    }//////////作业二.4

    public static void maxString(String str1, String str2) {
        String max = " ", min = " ";
        max = (str1.length() > str2.length()) ? str1 : str2;
        min = (str1 == max) ? str2 : str1;

    }//////////作业二.5

    public static void outNumber() {
        String str = "iu7i8hy4jnb2";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                System.out.println(str.charAt(i));
        }
    }//////////作业二.6

    public static boolean equalsStr(String str1,String str2){
        int a=str1.length();
        for (int i=0;i<a;i++){
            System.out.println(str1);
            System.out.println(str2);
            String tmp= str1.charAt(0)+"";
            str2=str2.replaceFirst(tmp,"");
            str1=str1.substring(1);
            if (str1.length()==0&&str2.length()==0)
                return true;
            System.out.println("test");
        }
        return false;
    }//////////作业二.7
    /*public static boolean equalsStr(String str1, String str2) {
        char[] str11 = str1.toCharArray();
        char[] str22 = str2.toCharArray();
        Arrays.sort(str11);
        Arrays.sort(str22);
        return Arrays.equals(str11,str22);
    }//////////作业二.7*/


    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        String[] str = {"aaaaaa", "bbb", "ccccccccccccc"};
        stringDemo.Work1();
        System.out.println(stringDemo.rtrim("aaa        ") + "111111111");
        StringDemo.printCharInfo("apple is a apple.");
        System.out.println(StringDemo.concat("ok"));
        System.out.println(StringDemo.moveToRight("Hello world", 3));
        StringDemo.maxLength(str);
        System.out.println(StringDemo.stringAt("abcdefgh", "fg"));
        System.out.println(StringDemo.huiWen("abcba") ? "是回文数" : "不是回文数");
        StringDemo.Analysis("01#张三#20-02#李四#30-03#王五#40");
        StringDemo.getString();
        System.out.println(StringDemo.trim(" t r  itrimtrimtrim  "));
        StringDemo.replaceString("abcdefgh", 3, 6);
        StringDemo.outNumber();
        System.out.println(StringDemo.equalsStr("abcd", "bcda") ? "相等" : "不相等");
    }
}