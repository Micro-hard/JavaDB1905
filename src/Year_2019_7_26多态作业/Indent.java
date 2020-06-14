package Year_2019_7_26多态作业;

public class Indent {//订单
    private int indentNumber;//订单编号
    private double amount;//总额
    public DynamicItem dynamicItem;//动态商品数组
    public Commodity [] commodity;


    /*public Indent(int indentNumber, double amount, Commodity[] commodity) {
        this.indentNumber = indentNumber;
        this.amount = amount;
        this.commodity = commodity;
    }*/
    public Indent(int indentNumber, double amount,DynamicItem dynamicItem) {
        this.indentNumber = indentNumber;
        this.amount = amount;
        this.dynamicItem=dynamicItem;
        //this.commodity = commodity;
    }
    public void display(){
        double sum=0;
        System.out.println("--------------------------");
        System.out.println("订单编号："+this.indentNumber);
        System.out.println("--------------------------");
        System.out.println("商品名称  商品数量  商品单价");
        /*for (int i=0;i<commodity.length;i++){
            System.out.println(commodity[i].getName()+"  \t"+commodity[i].getAmount()+"\t\t"+commodity[i].getPrice());
        }*/
        for (int i=0;i<dynamicItem.size;i++){
            System.out.println(dynamicItem.getArrays()[i].getName()+"  \t"+dynamicItem.getArrays()[i].getAmount()+"\t\t"+dynamicItem.getArrays()[i].getPrice());
           }
        System.out.println("--------------------------");
        System.out.print("商品总价:");
        for (int i=0;i<dynamicItem.size;i++){//dynamicItem.getArrays().length
            sum+=dynamicItem.getArrays()[i].zongjia();
        }
        /*for (int i=0;i<commodity.length;i++){
             sum+=commodity[i].zongjia();
        }*/
        System.out.println(sum);
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        DynamicItem dynamicItem=new DynamicItem();
        //Commodity [] commodity=new Commodity[2];

        dynamicItem.add(new Commodity(001,"足球",388.99,2));
        dynamicItem.add(new Commodity(002,"洗面奶",200,2));
        dynamicItem.remove();

        //commodity[0]=new Commodity(001,"足球",388.99,2);
        //commodity[1]=new Commodity(002,"洗面奶",23.9,7);
//        Indent indent=new Indent(100008793,commodity[0].getAmount()*commodity[0].getPrice()+commodity[1].getAmount()*commodity[1].getPrice(),dynamicItem);
        Indent indent=new Indent(100008793,0,dynamicItem);
        indent.display();
    }
}
