package Year_2019_7_24_extend;

public class Adult extends Civilian{
    private String xueli;//学历
    private String profession;//职业

    public Adult(int number, String name, String date, String xueli, String profession) {
        super(number, name, date);
        this.xueli = xueli;
        this.profession = profession;
    }

    public String getXueli() {
        return xueli;
    }

    public String getProfession() {
        return profession;
    }
}
