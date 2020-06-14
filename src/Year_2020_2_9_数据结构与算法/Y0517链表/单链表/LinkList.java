package Year_2020_2_9_数据结构与算法.Y0517链表.单链表;

import java.util.Collections;
import java.util.Iterator;

//单链表
public class LinkList<T> implements Iterable<T>{
    //记录头节点
    private Node head;
    //记录链表的长度
    private int N;

    //节点类
    private class Node{
        //数据
        T item;
        //下一个节点
        Node next;
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList(){
        //初始化头节点
        this.head=new Node(null,null);
        //初始化元素个数
        this.N=0;
    }

    //清空链表
    public void clear(){
        head.next=null;
        this.N=0;
    }

    //获取链表长度
    public int length(){
        return this.N;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return this.N==0;
    }

    //指定位置为i处的元素
    public T get(int i){
        Node n=head.next;
        for (int j = 0; j <i ; j++) {
            n=n.next;
        }
        return (T) n.item;
    }

    //添加元素
    public void insert(T t){
        Node n=head;
        while (n.next!=null){
            n=n.next;
        }
        Node newNode=new Node(t,null);
        n.next=newNode;
        N++;
    }

    //在指定i位置处添加元素
    public void insert(int i,T t){
        Node pre=head;
        for(int j=0;j<i;j++){
            pre=pre.next;
        }

        Node newNode=new Node(t,pre.next);
        pre.next=newNode;
        N++;
    }

    //删除第i个节点
    public T remove(int i){
        Node pre=head;
        for(int j=0;j<i;j++){
            pre=pre.next;
        }
        Node curr=pre.next;
        Node nextNode=curr.next;
        pre.next=nextNode;
        N--;
        return (T)curr.item;
    }

    //查找出元素t第一次出现的位置
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

    @Override//    迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
        Node n;
        public LIterator() {
            this.n=head;
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

//    //反转整个单链表
//    public void reverse(){
//        if(isEmpty()){
//            return;
//        }
//        reverse(head.next);
//    }
//    //反转指定的结点curr并把反转后的节点返回
//    public Node reverse(Node curr){
//        if(curr.next==null){
//            head.next=curr;
//            return curr;
//        }
//        //递归反转当前节点curr的下一个节点，返回值就是链表反转后当前节点的上一个节点
//        Node pre=reverse(curr.next);
//        pre.next=curr;
//        curr.next=null;
//        return curr;
//    }
    public void reverse(){
        if(isEmpty()){
            return;
        }
        reverse(head.next);
    }
    public Node reverse(Node curr){
        if(curr.next==null){
            head.next=curr;
            return curr;
        }
        Node pre=reverse(curr.next);
        pre.next=curr;
        curr.next=null;
        return curr;
    }

    public static void main(String[] args) {
        LinkList<String> linkList=new LinkList<>();
        linkList.insert("姚明");
        linkList.insert("科比");
        linkList.insert("麦迪");
        linkList.insert(1,"詹姆斯");

        for (String s : linkList) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println("反转后的链表为");
        linkList.reverse();
        for (String s : linkList) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println("1的结果为"+linkList.get(1));

        System.out.println("删除的："+linkList.remove(1));
        linkList.clear();
        System.out.println("清空后的长度为："+linkList.length());

    }
}
