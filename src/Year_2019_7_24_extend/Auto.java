package Year_2019_7_24_extend;

public class Auto {
    private int Lnumber;//轮胎个数
    private String color;
    private int weight;
    private int velocity;

    public Auto(int lnumber, String color, int weight, int velocity) {
        Lnumber = lnumber;
        this.color = color;
        this.weight = weight;
        this.velocity = velocity;
    }

    public void add(int velocity){
        this.velocity+=velocity;
    }
    public void sub(int velocity){
        this.velocity-=velocity;
        if (this.velocity<0)
            this.velocity=0;
    }
    public void stop(){
        this.velocity=0;
    }

    public int getLnumber() {
        return Lnumber;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setLnumber(int lnumber) {
        Lnumber = lnumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
