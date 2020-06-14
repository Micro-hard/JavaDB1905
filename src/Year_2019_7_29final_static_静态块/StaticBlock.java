package Year_2019_7_29final_static_静态块;

public class StaticBlock {
    public static int total;

    public static void total(){
        System.out.println("非静态块");

    }
    static{//静态块
        total=1;
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        StaticBlock staticBlock1=new StaticBlock();
        StaticBlock staticBlock2=new StaticBlock();
        StaticBlock staticBlock3=new StaticBlock();
        StaticBlock staticBlock4=new StaticBlock();

    }
}
