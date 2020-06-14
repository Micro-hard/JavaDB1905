package Year_2020_2_9_数据结构与算法.Y0522符号表KV;

public class SymbolTable<Key,Value> {
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
    public SymbolTable(){
        this.head=new Node(null, null, null);
        this.N=0;
    }
    public int size(){
        return N;
    }
    public void put(Key key,Value value){
        //如果有key，替换value
        Node n=head;
        while (n.next!=null){
            n=n.next;
            if(n.key.equals(key)){
                n.value=value;
                return;
            }
        }
        Node newNode=new Node(key, value, null);
        newNode.next=head.next;
        head.next=newNode;
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
        SymbolTable<Integer,String> symbolTable=new SymbolTable();
        symbolTable.put(1, "哈哈");
        symbolTable.put(2, "嘿嘿");
        symbolTable.put(2, "??");
        symbolTable.put(3, "呵呵");
        symbolTable.put(4, "嘎嘎");
        System.out.println(symbolTable.size());
        System.out.println(symbolTable.get(2));
    }
}
