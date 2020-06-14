package Year_2019_7_29final_static_静态块;

public class ZiJiDe {
    private static ZiJiDe ziJiDe=new ZiJiDe();//贪婪
    private ZiJiDe(){

    }

    public static ZiJiDe getInstance() {
        return ziJiDe;
    }

    public int add(int a,int b){
        return a+b;
    }
}
class ttest{
    public static void main(String[] args) {
        ZiJiDe a=ZiJiDe.getInstance();
        ZiJiDe b=ZiJiDe.getInstance();
        if (a==b)
            System.out.println("a is equals to b!");
        System.out.println(a);
        System.out.println(b);
    }
}
