package HomeworkMethod;

public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;
    public WuMingFen(String theMa,int quantity,boolean likeSoup){//构造
        this.theMa=theMa;
        this.quantity=quantity;
        this.likeSoup=likeSoup;
    }
    public WuMingFen(String theMa,int quantity){//重载
        this.theMa=theMa;
        this.quantity=quantity;
    }
    public void check(){
        System.out.println(this.theMa+    +this.quantity);
        System.out.println(this.likeSoup?"代糖":"不带躺");
    }

    public static void main(String[] args) {
        WuMingFen a=new WuMingFen("shit",22,true);
        a.check();
    }
}
