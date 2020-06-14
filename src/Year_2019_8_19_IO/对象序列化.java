package Year_2019_8_19_IO;

import java.io.*;

public class 对象序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:\\IO819\\IO对象序列化"));
        Employee[] e=new Employee[5];
        for (int i=0;i<5;i++){
            e[i]=new Employee(i+"哈哈",i);
        }
        out.writeObject(e);
        //out.writeObject(new Employee("李现",19));
        //out.writeObject(new Employee("李杠",19));
        //out.writeObject(new Employee("邓论",19));
        out.close();

        ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:\\\\IO819\\\\IO对象序列化"));
        Employee[] emp=(Employee[]) input.readObject();

        for (int i=0;i<5;i++){
            System.out.println("姓名："+emp[i].getName());
            System.out.println("年龄："+emp[i].getAge());
        }
        //Employee emp=(Employee) input.readObject();
        //Employee emp1=(Employee) input.readObject();
        //System.out.println("姓名："+emp.getName());
        //System.out.println("年龄："+emp.getAge());
        input.close();
    }
}
