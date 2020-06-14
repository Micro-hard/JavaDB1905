package Year_2020_2_9_数据结构与算法.Y0517链表.顺序表;

import java.util.ArrayList;
import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
    //存储的元素
    private T[] eles;
    //当前顺序表中元素的个数
    private int N;

    public SequenceList(int capacity){
        this.eles=(T[])new Object[capacity];
        this.N=0;
    }
    //情空线性表
    public void clear(){
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }

    public T get(int i){
        return eles[i];
    }

    public void insert(T t){
        if(N==eles.length){
            resize(2*eles.length);
        }
        eles[N++]=t;//!!!!!!!!!!!
    }
    public void insert(int i,T t){
        if(N==eles.length){
            resize(2*eles.length);
        }
        //先把i及其后面的元素一次后移一位
        for(int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }
        //把t放到i处
        eles[i]=t;
        N++;
    }

    public T remove(int i){
        //记录i处的值
        T current=eles[i];
        //让i后面的元素一次前移
        for(int index=i;i<N-1;i++){
            eles[i]=eles[i+1];
        }
        //个数减一！！！！
        N--;
        //缩容，元素个数小于容量的四分之一，缩容为一半
        if(N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }
    public int indexOf(T t){
        for (int i = 0; i < N; i++) {
            if(eles[i]==t){
                return i;
            }
        }
        return -1;
    }

    //根据参数newsize重置eles大小  扩容！！！
    public void resize(int newSize){
        //临时数组
        T[] temp=eles;
        //新数组
        eles=(T[])new Object[newSize];
        //原数组拷贝到新数组
        for(int i=0;i<N;i++){
            eles[i]=temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private int cusor;
        public SIterator() {
            cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }
        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
    public static void main(String[] args) {
        SequenceList<String> list=new SequenceList<>(2);
        list.insert("姚明");
        list.insert("科比");
        list.insert("麦迪");
        list.insert(1,"詹姆斯");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        String result = list.get(1);
        System.out.println("一处为"+result);
        System.out.println("删除的为"+list.remove(0));
        list.clear();
        System.out.println("清空后的线性表中的个数为："+list.length());
    }
}
