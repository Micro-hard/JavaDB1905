package Year_2020_2_9_数据结构与算法.Y0523二叉查找树;

//自己写的
public class BinaryTreetest<Key extends Comparable<Key>,Value> {
    //根
    private Node root;
    //节点数
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
        root=put(root, key, value);
    }
    public Node put(Node x,Key key,Value value){
        if(x==null){
            N++;
            return new Node(key, value, null, null);
        }

        int cmp=key.compareTo(x.key);
        if(cmp>0){
            x.right=put(x.right, key, value);
        }else if(cmp<0){
            x.left=put(x.left, key, value);
        }else {//如果key相等替换value
            x.value=value;
        }
        //N++; 应该在上面加
        return x;
    }

    public Value get(Key key){
        return get(root, key);
    }
    public Value get(Node x,Key key){
        if(x==null){
            return null;
        }

        int cmp=key.compareTo(x.key);
        if(cmp>0){
            return get(x.right,key);
        }else if(cmp<0){
            return get(x.left,key);
        }else {//如果key相等返回value
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

        int cmp=key.compareTo(x.key);
        if(cmp>0){
            x.right=delete(x.right, key);
        }else if(cmp<0){
            x.left=delete(x.left, key);
        }else {//如果key相等返回value
            N--;
            if(x.right==null){
                return x.left;
            }
            if(x.left==null){
                return x.right;
            }
            //找到右子树最小的节点，
            Node minNode= x.right;
            while (minNode.left!=null){
                minNode=minNode.left;
            }
            //删除右子树最小的节点，
            Node n =x.right;
            while (n.left!=null){
                if(n.left.left==null){
                    n.left=null;
                }else {
                    n=n.left;
                }
            }
            minNode.left=x.left;
            minNode.right=x.right;
            x=minNode;
        }
        return x;
    }
    public static void main(String[] args) {
        BinaryTree<Integer,String> tree=new BinaryTree<>();
        tree.put(1, "张三");
        tree.put(2, "李四");
        tree.put(3, "王五");
        tree.put(4, "赵六");
        tree.put(5, "老七");
        System.out.println("个数:"+tree.size());
        System.out.println(tree.get(2));
        tree.delete(3);

        System.out.println("删除后个数:"+tree.size());
        System.out.println(tree.get(3));
    }
}
