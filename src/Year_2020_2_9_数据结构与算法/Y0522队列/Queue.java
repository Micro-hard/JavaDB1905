package Year_2020_2_9_数据结构与算法.Y0522队列;

import java.util.Iterator;

//单链表模拟队列
public class Queue<T> implements Iterable<T>{
    private Node head;
    private Node last;
    private int N;


    private class Node{
        public T item;
        public Node next;
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Queue(){
        head=new Node(null, null);
        last=null;
        N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    //入   尾插
    public void enqueue(T t){
        if(isEmpty()){
            last=new Node(t, null);
            head.next=last;
        }else {
            Node newNode=new Node(t, null);
            last.next=newNode;
            last=newNode;
        }
        N++;
    }
    //出    头出
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        Node n=head.next;
        head.next=head.next.next;
        N--;
        if(isEmpty()){
            last=null;
        }
        return n.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }
    private class QIterator implements Iterator{
        private Node n;

        public QIterator(){
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
        Queue<String> queue=new Queue<>();
        queue.enqueue("a");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("------------");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.size());
    }
}
