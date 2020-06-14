package Year_2019_7_24_extend;

public class Civilian {//百姓居民
    private int number;//身份证号
    private String name;//
    private String date;//出生日期

    public Civilian(int number, String name, String date) {
        this.number = number;
        this.name = name;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
