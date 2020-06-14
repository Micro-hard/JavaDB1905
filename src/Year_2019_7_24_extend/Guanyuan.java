package Year_2019_7_24_extend;

public class Guanyuan extends Adult{
    private String dangPai;//党派
    private String dyty;//职务

    public Guanyuan(int number, String name, String date, String xueli, String profession, String dangPai, String dyty) {
        super(number, name, date, xueli, profession);
        this.dangPai = dangPai;
        this.dyty = dyty;
    }

    public String getDangPai() {
        return dangPai;
    }

    public String getDyty() {
        return dyty;
    }
}
