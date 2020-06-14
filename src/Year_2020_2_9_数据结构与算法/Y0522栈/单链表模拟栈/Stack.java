package Year_2020_2_9_数据结构与算法.Y0522栈.单链表模拟栈;

import java.util.Iterator;

//单链表模拟栈
public class Stack<T> implements Iterable<T>{
    //记录首节点
    private Node head;
    //栈中元素的个数
    private int N;

    private class Node{
        public T item;
        public Node next;
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Stack (){
        this.head=new Node(null, null);
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(T t){
        Node newNode=new Node(t, head.next);
        head.next=newNode;
        N++;
    }
    public T pop(){
        if(head.next==null){
            return null;
        }
        Node n=head.next;
        head.next=head.next.next;
        N--;
        return n.item;
    }
    @Override
    public Iterator<T> iterator(){
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private Node n;
        public SIterator(){
            n=head;
        }
        @Override
        public boolean hasNext(){
            return n.next!=null;
        }
        @Override
        public T next(){
            n=n.next;
            return n.item;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println("----------------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}