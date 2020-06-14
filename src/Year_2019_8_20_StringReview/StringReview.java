package Year_2019_8_20_StringReview;
import java.util.ArrayList;
import java.util.Arrays;
public class StringReview {

    public static void work1(){
        String str="j23445sf97sd321";
        ArrayList arrayList=new ArrayList();
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                arrayList.add( str.charAt(i));
            }
        }
        Object[] a=arrayList.toArray();
        Arrays.sort(a);
        for (Object o:a){
            System.out.println(o);
        }
    }
    public static String[] split(String original,String fgf){
        String[] str=null;
        ArrayList<String> list=new ArrayList<>();
        int temp=0;//用于记录上一次分割的位置
        int j=0;
        for (int i=0;i<original.length();i++){
            if (temp==0&&i==0){
                j=temp;
            }else {
                j=temp+1;
            }
            if (fgf.equals(original.charAt(i)+"")){
                temp=i;
                list.add(original.substring(j,i));
            }
        }
        str=(String[]) list.toArray(new String[0]);//ArrayList转字符串数组
        return  str;
    }
    public static void main(String[] args) {
        //work1();
        String [] str=split("**as*sdf*fsdaf*asdsd*111*a*","*");
        for (int i=0;i<str.length;i++)
            System.out.println(str[i]);
        //System.out.println(str.toString());
        //String fgf1=fgf.substring(1).substring(0,fgf.substring(1).length()-1);
    }
}
