package Year_2020_2_9_数据结构与算法.Y0523二叉查找树.Y0524折纸问题;

import Year_2020_2_9_数据结构与算法.Y0522队列.Queue;

public class PagerFoldingTest {
    public static void main(String[] args) {
        Node<String> tree = createTree(2);
        printTree(tree);
    }

    public static Node<String> createTree(int N){
        Node<String> root=null;
        for (int i = 0; i < N; i++) {
            if(i==0){
                root=new Node<>("down",null ,null);
                continue;
            }
            Queue<Node> queue= new Queue<>();
            queue.enqueue(root);
            while (!queue.isEmpty()){
                Node<String> tmp=queue.dequeue();
                if(tmp.left!=null){
                    queue.enqueue(tmp.left);
                }
                if(tmp.right!=null){
                    queue.enqueue(tmp.right);
                }
                if(tmp.left==null&&tmp.right==null){
                    tmp.left=new Node<String>("down", null, null);
                    tmp.right=new Node<String>("up", null, null);
                }
            }
        }
        return root;
    }
    //打印
    public static void printTree(Node<String> root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            printTree(root.left);
        }
        System.out.print(root.item+" ");
        if(root.right!=null){
            printTree(root.right);
        }
    }

    private static class Node<T>{
        public T item;
        public Node left;
        public Node right;

        public Node(T item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }
}
