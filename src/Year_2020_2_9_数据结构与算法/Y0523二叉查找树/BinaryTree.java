package Year_2020_2_9_数据结构与算法.Y0523二叉查找树;

import Year_2020_2_9_数据结构与算法.Y0522队列.Queue;

import java.util.LinkedList;

//链表 二叉查找树
public class BinaryTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;

    private class Node{
        public Key key;
        public Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public int size(){
        return N;
    }

    public void put(Key key,Value value){
        //返回给root
        root=put(root, key, value);
    }
    public Node put(Node x,Key key,Value value){
        //如果x树为空
        if(x==null){
            N++;
            return new Node(key, value, null, null);
        }
        //如果x树不为空
        //新的key与树中的key比较
        int cmp=key.compareTo(x.key);
        if(cmp>0){
            x.right=put(x.right, key, value);
        }else if(cmp<0){//key小于x结点的键，找左子树，
            x.left=put(x.left,key ,value );
        }else {//key等于x结点的键，替换value
            x.value=value;
        }
        return x;
    }
    //从整个树找
    public Value get(Key key){
        return get(root, key);
    }
    public Value get(Node x,Key key){
        //x为null
        if(x==null){
            return null;
        }
        //x不为null
        int cmp=key.compareTo(x.key);
        if(cmp>0){
            return get(x.right,key );
        }else if(cmp<0){//key小于x结点的键，找左子树，
            return get(x.left,key );
        }else {//key等于x结点的键，替换value
            return x.value;
        }
    }

    public void delete(Key key){
        delete(root, key);
    }
    public Node delete(Node x,Key key){
        if(x==null){
            return null;
        }
        //x不为null
        int cmp=key.compareTo(x.key);
        if(cmp>0){
            x.right=delete(x.right, key);
        }else if(cmp<0){//key小于x结点的键，找左子树，
            x.left=delete(x.left,key );
        }else {//key等于x结点的键，删除x节点，
            N--;
            if(x.right==null){
                return x.left;
            }
            if(x.left==null){
                return x.right;
            }
            Node minNode=x.right;
            while(minNode.left!=null){
                minNode=minNode.left;
            }
            //删除右子树中最小的节点
            Node n=x.right;
            while (n.left!=null){
                if(n.left.left==null){
                    n.left=null;
                }else {
                    n=n.left;
                }
            }
            //让x节点的左子树成为minnode的左子树，x的右子树成为minnode的右子树
            minNode.left=x.left;
            minNode.right=x.right;
            x=minNode;

        }
        return x;
    }

    //最小的键
    public Key min(){
        return min(root).key;
    }
    public Node min(Node x){
        //有左子树
        if(x.left!=null){
            return min(x.left);
        }else {//没有左子树
            return x;
        }
    }
    //最大的键
    public Key max(){
        return max(root).key;
    }
    public Node max(Node x){
        if(x.right!=null){
            return max(x.right);
        }else {
            return x;
        }
    }

    //前序遍历！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root, keys);
        return keys;
    }
    //获取指定树的所有键，放到keys中        中 左 右
    public void preErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        //把x节点的key放到keys中，
        keys.enqueue(x.key);
        //递归遍历x节点的左子树
        if(x.left!=null){
            preErgodic(x.left, keys);
        }
        //递归遍历x的右子树
        if(x.right!=null){
            preErgodic(x.right,keys );
        }
    }
    //中序遍历!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Queue<Key> midErgodic(){
        Queue<Key> keys=new Queue<>();
        midErgodic(root,keys );
        return keys;
    }
    public void midErgodic(Node x,Queue<Key> keys){  //左  中  右
        if(x==null){
            return;
        }
        if(x.left!=null){
            midErgodic(x.left,keys);
        }

        keys.enqueue(x.key);

        if(x.right!=null){
            midErgodic(x.right,keys);
        }
    }
    //后序遍历！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    public Queue<Key> afterErgodic(){
        Queue<Key> keys=new Queue<>();
        afterErgodic(root, keys);
        return keys;
    }
    public void afterErgodic(Node x,Queue<Key> keys){//  左  右  中
        if(x==null){
            return;
        }
        if(x.left!=null){
            afterErgodic(x.left, keys);
        }
        if(x.right!=null){
            afterErgodic(x.right,keys );
        }

        keys.enqueue(x.key);
    }
    //层序遍历!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /*public Queue<Key> layerErgodic(){
        //树中的键
        Queue<Key> keys = new Queue<>();
        //树中节点
        Queue<Node> nodes = new Queue<>();

        nodes.enqueue(root);

        while (!nodes.isEmpty()){
            Node n = nodes.dequeue();
            keys.enqueue(n.key);
            if(n.left!=null){
                nodes.enqueue(n.left);
            }
            if(n.right!=null){
                nodes.enqueue(n.right);
            }
        }
        return keys;
    }*/
    //层序遍历，用的java自带的Queue
    public java.util.Queue<Key> layerErgodic(){
        java.util.Queue <Key> keys=new LinkedList<>();
        java.util.Queue <Node> nodes=new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()){
            Node n=nodes.poll();
            keys.offer(n.key);
            if(n.left!=null){
                nodes.offer(n.left);
            }
            if(n.right!=null){
                nodes.offer(n.right);
            }
        }
        return keys;
    }

    //树的最大深度
    public int maxDepth(){
        return maxDepth(root);
    }
    public int maxDepth(Node x){
        if(x==null){
            return 0;
        }
        int max=0;
        int maxL=0;
        int maxR=0;
        if(x.left!=null){
            maxL=maxDepth(x.left);
        }
        if(x.right!=null){
            maxR=maxDepth(x.right);
        }
        max=maxL>maxR?maxL+1:maxR+1;
       // maxL>maxR?(maxL+1):(maxR+1);   Not a statement
        return max;
    }

    public static void main(String[] args) {
        BinaryTree<String,String> tree=new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");
        
        //Queue<String> keys=tree.preErgodic();
        //Queue<String> keys=tree.midErgodic();
        //Queue<String> keys=tree.afterErgodic();
        //Queue<String> keys=tree.layerErgodic();
        java.util.Queue<String> keys=tree.layerErgodic();

        for (String key : keys) {
            System.out.println(key+"---"+tree.get(key));
        }
        System.out.println("最大深度："+tree.maxDepth());
        /*System.out.println("个数:"+tree.size());
        System.out.println(tree.get(2));
        tree.delete(3);

        System.out.println("删除后个数:"+tree.size());
        System.out.println(tree.get(3));*/
    }
}
