package Year_2019_7_30抽象类_接口;

public abstract class Tuxing {
    double zhouchang;
    double mianji;

    public void setBianchang(double bianchang) {
        this.zhouchang = bianchang;
    }

    public void setMianji(double mianji) {
        this.mianji = mianji;
    }

    public double getBianchang() {

        return zhouchang;
    }

    public double getMianji() {
        return mianji;
    }
    public abstract double getmianji();
    public abstract double getZhouchang();
}
