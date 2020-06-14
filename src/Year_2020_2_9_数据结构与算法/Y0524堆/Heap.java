package Year_2020_2_9_数据结构与算法.Y0524堆;

public class Heap<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public Heap(int capacity) {
        //items=(T[])new Object[capacity];  有问题，java.lang.ClassCastException:
        items=(T[])new Comparable[capacity+1];
        N=0;
    }
    //判断堆中索引i处的元素是否小于索引j处的元素
    public boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }
    //交换堆中
    public void exch(int i,int j){
        T temp=items[i];
        items[i]=items[j];
        items[j]=temp;
    }

    public void insert(T t){
        //从1开始，不从零开始，
        items[++N]=t;
        swim(N);
    }
    //上浮算法，使k处的元素处于一个正确的位置
    public void swim(int k){
        while (k>1){
            //父节点比当前节点小
            if(less(k/2,k )){
                exch(k/2, k);
            }
            k=k/2;
        }
    }
    //删除堆中最大元素
    public T delMax(){
        T max=items[1];
        //让最右侧的变为临时根节点，
        exch(1, N);
        items[N]=null;
        N--;
        //使用下浮算法调整，让堆重新有序
        sink(1);
        return max;
    }
    public void sink(int k){
        //通过循环不断的对比当前k结点和其左子结点2*k以及右子结点2k+1处中的较大值的元素大小，如果当前结点小，则需要交换位置
        while (2*k<N){//2*k!!!!!!!!!!!!!!!!!
            //获取当前结点的子结点中的较大结点
            int max;
            if(2*k+1<=N){
                if(less(2*k, 2*k+1)){
                    max=2*k+1;
                }else {
                    max=2*k;
                }
            }else {
                max=2*k;
            }
            //比较当前结点和较大结点的值
            if(!less(k, max)){
                break;
            }
            //交换k索引处的值和max索引处的值
            exch(k, max);
            k=max;
        }
    }

    public static void main(String[] args) {
        Heap<String> heap=new Heap<>(10);
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");
        String result=null;
        while ((result=heap.delMax())!=null){
            System.out.println(result+" ");
        }

    }

}
