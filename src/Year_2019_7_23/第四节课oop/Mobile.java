package Year_2019_7_23.第四节课oop;

public class Mobile {
    String pinPai;
    int rongliang;
    boolean iscall;
    void duanxin(String num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Mobile Huawei= new Mobile();
        Mobile phone2= new Mobile();
        System.out.println(Huawei.iscall?"yes":"no");
        Huawei.pinPai="HUAWEI";
        Huawei.rongliang=128;
        Huawei.iscall=true;
        System.out.println(Huawei.pinPai);
        Huawei.duanxin("13888888888");

    }
}