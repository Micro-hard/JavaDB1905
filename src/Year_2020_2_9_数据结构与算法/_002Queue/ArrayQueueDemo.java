package Year_2020_2_9_数据结构与算法._002Queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        System.out.println("测试数组模拟环形队列案例");
        CircleArray circleArray=new CircleArray(5);//容量最大是9
        circleArray.addQueue(1);
        circleArray.addQueue(1);
        circleArray.addQueue(1);
        circleArray.getQueue();
        circleArray.addQueue(1);
        circleArray.addQueue(1);



        circleArray.showQueue();
    }
}
//使用数组模拟环形队列
class CircleArray{
    private int maxSize;//数组的最大容量
    //front初值为0，front指向队列的第一个元素arr[front]
    private int front;
    //rear的初值为0，指向队列最后一个元素的后一个位置，希望空出一个
    private int rear;
    private int[] arr;//用于存放数据，模拟队列

    public CircleArray(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }

    //添加数据到队列
    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列满");
            return;
        }
        //直接加入
        arr[rear]=n;
        rear=(rear+1)%maxSize;//循环的
    }

    //出队列
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空");
        }
        int value=arr[front];
        front=(front+1)%maxSize;//循环的
        return value;
    }

    //显示队列所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("空");
            return;
        }
        for(int i=front;i<front+size();i++){
            System.out.printf("arr[%d]=%d\t",i%maxSize,arr[i%maxSize]);
        }

    }

    //返回队列有效数据的个数
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }
}
