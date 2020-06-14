package Year_2020_2_9_数据结构与算法.Y0522符号表KV;

//有序的符号表     key 继承comparable接口
public class OrderSymbolTable<Key extends Comparable<Key>,Value> {
    private Node head;
    private int N;

    private class Node{
        public Key key;
        public Value value;
        public Node next;
        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public OrderSymbolTable(){
        this.head=new Node(null, null, null);
        this.N=0;
    }
    public int size(){
        return N;
    }
    public void put(Key key,Value value){
        //定义两个变量 当前， 当前的上一个
        Node curr=head.next;
        Node pre=head;
        while (curr!=null&& key.compareTo(curr.key)>0){
            pre=curr;
            curr=curr.next;
        }
        //key相同，替换
        if(curr!=null&& key.compareTo(curr.key)==0){
            curr.value=value;
            return;
        }
        //key不一样，插入到curr之前
        Node newNode = new Node(key,value,curr);
        pre.next=newNode;
        N++;
    }
    public void delete(Key key){
        Node n=head;
        while(n.next!=null){
            if(n.next.key.equals(key)){
                n.next=n.next.next;
                N--;
                return;
            }
            n=n.next;
        }
    }
    public Value get(Key key){
        Node n=head;
        while (n.next!=null){
            n=n.next;
            if(n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        OrderSymbolTable<Integer,String> symbolTable=new OrderSymbolTable();
        symbolTable.put(5, "哈哈");
        symbolTable.put(1, "嘿嘿");
        symbolTable.put(2, "??");
        symbolTable.put(4, "呵呵");
        symbolTable.put(3, "嘎嘎");
        System.out.println(symbolTable.size());
        System.out.println(symbolTable.get(2));
    }
}
