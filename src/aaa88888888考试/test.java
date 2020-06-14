package aaa88888888考试;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test implements Runnable {
    //public final int A;

    private int count = 1000;
    public boolean isQU;//是否取钱？

    public test(boolean isQU) {
        this.isQU = isQU;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {

        return count;
    }

    public static void showName(File f) {  //第二题           第一题在卷子上写的
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null)
                for (File file : files) {
                    showName(file);
                }
        } else {
            System.out.println(f.getName());
        }
    }

    public static void readText(File file) {  //第三题///文件名   d://info//txt
        try {
            FileInputStream in = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            reader.readLine();
            reader.readLine();
            in.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void work4() {  //第四题
        String str = "张三，李四，李武，李六，李琦，篱笆，利旧，历史，历史一，李十二";
        String[] s = str.split(",");
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(s[i]);
        }
        Collections.shuffle(list);
        s = (String[]) list.toArray(new String[0]);
        for (int i = 0; i < 4; i++) {
            System.out.println(s[i]);
        }
    }



    @Override
    public void run() {       //第五题
        int count;
        synchronized (this) {
            if (this.isQU) {//不取
                count = this.getCount() + 100;
                this.setCount(count);
            } else {//取
                count = this.getCount() - 100;
                this.setCount(count);
            }
        }
    }


    public static void sss(){
        int a;
    }
    public static void main(String[] args) {
//        test t1 = new test(true);
//        test t2 = new test(false);
//        Thread thread1 = new Thread(t1, "线程一");
//        Thread thread2 = new Thread(t2, "线程二");
//        thread1.start();
//        thread2.start();

        float a=1.1f;
        float b=1.1f;

        String s="";
        System.out.println(s);

    }
}
/*class Child {
    public static void main(String [] args){
        int index=1;
        int foo[] = new int[3];
        int x =foo[index];
        int y=x+index;
    }
}*/

