package Year_2019_7_25_多态;

public class ZhanShi extends Hero{
    private int hujia;
    private int mokang;

    public ZhanShi(String name, int hp, int mp, int hujia, int mokang) {
        super(name, hp, mp);
        this.hujia = hujia;
        this.mokang = mokang;
    }

    public void setHujia(int hujia) {
        this.hujia = hujia;
    }

    public void setMokang(int mokang) {
        this.mokang = mokang;
    }

    public int getHujia() {

        return hujia;
    }

    public int getMokang() {
        return mokang;
    }
}
