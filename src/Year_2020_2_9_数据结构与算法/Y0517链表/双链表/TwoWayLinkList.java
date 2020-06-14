package Year_2020_2_9_数据结构与算法.Y0517链表.双链表;

import java.util.Iterator;
import java.util.LinkedList;

public class TwoWayLinkList<T> implements Iterable<T>{
    private Node head;
    private Node last;
    private int N;

    private class Node{
        T item;
        Node pre;
        Node next;
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
    public TwoWayLinkList() {
        head=new Node(null,null,null);
        last=null;
        N=0;
    }
    //情空链表
    public void clear(){
        this.head.next=null;
        this.head.pre=null;
        this.head.item=null;
        this.last=null;
        this.N=0;
    }
    //获取链表长度
    public int length(){
        return N;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取链表中第一个元素
    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.item;
    }
    //获取最后一个元素
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;
    }
    //插入元素
    public void insert(T t){
        //如果链表为空
        //创建新的节点，新节点成为尾节点，头指向尾节点
        if(isEmpty()){
            last=new Node(t,head,null);
            head.next=last;
        }else {//如果链表不为空
            Node oldLast=last;
            Node newNode=new Node(t,oldLast,null);//当前尾的pre指向之前的尾
            oldLast.next=newNode;//之前的尾的next指向当前的尾
            last=newNode;
        }
        N++;
    }
    //指定位置插入元素
    public void insert(int i,T t){
        if (i<0 || i>=N){
            throw new RuntimeException("位置不合法");
        }
        //找到i位置的前一个节点
        Node pre=head;
        for(int j=0;j<i;j++){
            pre=pre.next;
        }
        Node newNode=new Node(t,pre, pre.next);
        pre.next.pre=newNode;
        pre.next=newNode;
        N++;
    }
    //获取指定位置i处的元素
    public T get(int i){
        Node n=head.next;
        for (int j = 0; j < i; j++) {
            n=n.next;
        }
        return n.item;
    }
    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node n=head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if(n.item==t){
                return i;
            }
        }
        return -1;
    }
    //删除指定i位置的元素
    public T remove(int i){
        //指定位置的前一个节点
        Node pre=head;
        for (int j = 0; j <i ; j++) {
            pre=pre.next;
        }
        Node curr=pre.next;
        curr.next.pre=pre;
        pre.next=curr.next;
        N--;
        if(isEmpty())
            last=null;
        return curr.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator{
        private Node n;
        public TIterator() {
            n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }
        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }

    public static void main(String[] args) {
        //创建双向链表对象
        TwoWayLinkList<String> list=new TwoWayLinkList<String>();
        list.insert("姚明");
        list.insert("科比");
        list.insert("麦迪");
        list.insert(1,"詹姆斯");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.indexOf("科比"));
        System.out.println("--------------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("--------------------");

        System.out.println("1的结果为"+list.get(1));

        System.out.println("删除的："+list.remove(1));
        list.clear();
        System.out.println("清空后的长度为："+list.length());
       // System.out.println(list.last);
    }
}
