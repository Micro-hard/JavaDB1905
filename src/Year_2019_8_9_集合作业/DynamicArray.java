package Year_2019_8_9_集合作业;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {
    private Object[] o=new Object[0];
    public int size;  //真正放了多少
    private static final int extend_capacity=1;//  扩展

    public int getSize() {
        return size;
    }

    public void add(Object obj)   //追加一个新元素
    {
        if (size==o.length)
            extend();
        o[size++]=obj;
    }
    public void extend(){
        Object[] oNew= Arrays.copyOf(o,size+extend_capacity);
        o=oNew;
    }

    public void add(int index, Object obj)  //在某个位置插入一个元素
    {
        Object[] oNew=Arrays.copyOf(o,o.length+1);
        if (index>this.getSize()){
            System.out.println("越界");
            return;
        }
        if (index==o.length){//直接追加
//            oNew[o.length]=obj;
//            size++;
//            o=oNew;
//            return;
              add(obj);
              return;
        }
        for (int i=0;i<o.length;i++){//新数组的赋值
            if (i<index){
                oNew[i]=o[i];
            }else if (i==index){
                oNew[index]=obj;
                if (index==o.length-1){
                    oNew[i+1]=o[o.length-1];
                }
            }else{
                oNew[i+1]=o[i];
            }
        }
        size++;
        o=oNew;

    }

    public void remove(int index)   //删除指定位置的元素
    {
        if (index>=this.getSize()){
            System.out.println("越界");
            return;
        }
        if (index==o.length-1){
            o[o.length-1]=null;
            size--;
            return;
        }
        for (int i=0;i<o.length;i++){
            if (i>=index){
                if (i==o.length-1){
                    o[o.length-1]=null;
                    size--;
                    return;
                }
                o[i]=o[i+1];
            }
        }
    }

    public Object get(int index)    //根据索引，获得某个位置的元素
    {
        if (index>=this.getSize()){
            System.out.println("越界");
            return null;
        }
        for (int i=0;i<o.length;i++){
            if (i==index){
                return o[i];
            }
        }
        return null;
    }

    public void set(int index, Object obj)  //修改指定位置的元素
    {
        if (index>=this.getSize()){
            System.out.println("越界");
            return ;
        }
        for (int i=0;i<o.length;i++){
            if (i==index){
                o[i]=obj;
            }
        }
    }

    public boolean contain(Object obj)//是否包含某个元素
    {
        boolean isContain=false;
        for (int i=0;i<o.length;i++){
            if (o[i].equals(obj))
                isContain=true;
        }
        return isContain;
    }

    @Override
    public String toString() {
        //if (getSize()!=0)
        return "DynamicArray{" +
                "o=" + Arrays.toString(o) +
                ", size=" + size +
                '}';

    }

    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add("1abc");
        dynamicArray.add("2abc");
        dynamicArray.add("3abc");
        dynamicArray.add("4abc");
        //dynamicArray.add(1,"aaaaa");
        //dynamicArray.remove(0);
        //System.out.println(dynamicArray.get(3));
        //dynamicArray.set(0,5);
        //System.out.println(dynamicArray.contain("1abc"));
        System.out.println(dynamicArray);
    }

}
