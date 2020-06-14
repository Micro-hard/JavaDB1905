package JavaStudy;

public class Y2019_11_15_大数字运算 {
    public static void main(String[] args) {
        //数组里每个数和另一个数相乘，先求个位，除以十加到上一位，自己是对十取余
        //512*34
        /*int [] init=new int[8];
        init[init.length-1]=2;
        init[init.length-2]=1;
        init[init.length-3]=5;
        int num=34;
        //每一位的结果
        for (int i=0;i<init.length;i++){
            init[i]*=num;
        }
        //每一位进行进位和留位
        for (int i=init.length-1;i>0;i--){//这里容易越界，让i>0而不是>=0
            init[i-1]+=init[i]/10;
            init[i]=init[i]%10;
        }
        for (int i=0;i<init.length;i++){
            System.out.print(init[i]);
        }*/
        int n=50;
        int init[]=new int[100];
        init[init.length-1]=1;
        for (int i=0;i<=n;i++){
            init=operation(init,n);
        }
        for (int i=0;i<init.length;i++){
            System.out.print(init[i]);
        }
    }
    public static int[] operation(int []init,int num){
        //每一位的结果
        for (int i=0;i<init.length;i++){
            init[i]*=num;
        }
        //每一位进行进位和留位
        for (int i=init.length-1;i>0;i--){//这里容易越界，让i>0而不是>=0
            init[i-1]+=init[i]/10;
            init[i]=init[i]%10;
        }
        /*for (int i=0;i<init.length;i++){
            System.out.print(init[i]);
        }*/
        return init;
    }
}
