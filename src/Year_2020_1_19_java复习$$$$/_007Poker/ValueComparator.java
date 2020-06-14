package Year_2020_1_19_java复习$$$$._007Poker;

import java.util.Comparator;

public class ValueComparator implements Comparator<Puker> {
    @Override
    public int compare(Puker o1, Puker o2) {//先比值，后比颜色
        return o1.value==o2.value?o1.style-o2.style:o1.value-o2.value;
    }
}
