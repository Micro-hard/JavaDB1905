package Year_2019_7_24_extend;

public class Calculate1 {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculate2 calculate2=new Calculate2();
        System.out.println(calculate2.mul(8,8));
    }
}
