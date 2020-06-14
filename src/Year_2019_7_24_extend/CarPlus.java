package Year_2019_7_24_extend;

public class CarPlus extends Auto{
    private String CD;
    private boolean kongyiao;

    public CarPlus(int lnumber, String color, int weight, int velocity, String CD, boolean kongyiao) {
        super(lnumber, color, weight, velocity);
        this.CD = CD;
        this.kongyiao = kongyiao;
    }
    public void add(int velocity){
        int tmp=getVelocity();
        setVelocity(tmp+=velocity);
    }
    public void sub(int velocity){
        int tmp=getVelocity();
        setVelocity(tmp-=velocity);
    }

    public static void main(String[] args) {
        CarPlus carPlus=new CarPlus(4,"绿",100,200,"haha ",true);
        carPlus.add(10);
        System.out.println(carPlus.getVelocity());
    }
}
