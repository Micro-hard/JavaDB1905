package aaa88888888考试;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam002 implements Runnable{
    public static void Test011(int n){//第一题不用递归
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("累加和为："+sum);
    }
    public static int Test012(int n){//第一题用递归
        if (n==1)
            return 1;
        return n+Test012(n-1);
    }
    public static void Test02(){//第二题
        try {
            BufferedReader br=new BufferedReader(new FileReader("d:\\info.txt"));
            String str=br.readLine();
            str+=br.readLine();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Test03(){//第三题

    }

    public static void Test04(String[] str){//第四题
        ArrayList<Integer> arrayList=new ArrayList<Integer>(20);
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<str.length;i++){
            for (int j=0;j<str[i].length();j++){
                if (Character.isDigit(str[i].charAt(j))){
                    sb.append(str[i].charAt(j));
                }
            }
            System.out.println("数字："+sb);
            arrayList.add(Integer.parseInt(String.valueOf(sb)));
            sb.delete(0,sb.length());
        }
        int sum=0;
        for (int i=0;i<arrayList.size();i++)
            sum+=arrayList.get(i);
        System.out.println("数字和为："+sum);

    }
    public static void Test05(){//第五题
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(2);
        Object[] array=arrayList.toArray();
        Arrays.sort(array);
        int end=0;
        /*for (int i=0;i<array.length;i++)
            System.out.println(array[i]);*/

        for (int i=0;i<array.length;i=end+1) {
            int begin=i;
            end=0;
            while(((int)array[i]==(int)array[i+1])&&i<array.length-2){
               i++;
            }
            if (i==array.length-2){
                i++;
            }
            end=i;
            i=begin;
            System.out.println(array[i]+":"+(end-begin+1)+"次");
        }
    }
    @Override
    public void run() {

    }
    public static void main(String[] args) {
        //Test011(5);
        //System.out.println("累加和为："+Test012(5));
        //Test02();
        //String[] str={"adf1f23","ju34ui21"};
        //Test04(str);
        Test05();
    }


}
