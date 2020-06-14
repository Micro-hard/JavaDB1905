package Year_2020_1_19_java复习$$$$._007Poker;

/**
 * 单张扑克牌
 */
public class Puker implements Comparable<Puker>{
    static final String[] VALUES={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    static final String[] STYLES={"方块","草花","红心","黑桃"};
    int style;
    int value;

    public Puker(int style, int value) {
        super();
        this.style = style;
        this.value = value;
    }

    @Override
    public String toString() {
        return STYLES[style]+VALUES[value];
    }

    //比大小，按花色比,大小
    @Override
    public int compareTo(Puker o) {
        return this.style==o.style?this.value-o.value:this.style-o.style;//先比颜色后比值
    }
}
