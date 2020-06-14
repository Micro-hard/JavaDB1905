package Year_2019_7_26多态作业;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicItem {  //动态商品数组
    private Commodity[] arrays;
    public int size;//数组里真正放了几个商品  Commodity
    private final int extend_capacity = 10;  //final

    public DynamicItem() {//默认给10个容量
        arrays = new Commodity[10];
    }

    public DynamicItem(int initNum) {
        arrays = new Commodity[initNum];
    }

    public void add(Commodity item) {//尾部添加一个商品   判断够不够，不够就扩容
        if (size == arrays.length)
            extend();
        arrays[size++] = item;

    }

    public void extend() {
        Commodity[] arraysnew = Arrays.copyOf(arrays, size + extend_capacity);//扩展容量
        arrays = arraysnew;
    }

    public boolean remove() {//尾部删除一个商品
        this.arrays[size - 1] = null;
        size--;
        return true;
    }

    public Commodity[] getArrays() {
        return arrays;
    }
}

