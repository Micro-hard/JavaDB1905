package Year_2019_8_9_集合作业;

public class hmk8Poker implements Comparable<hmk8Poker>{
    private static final int heart=2;//红桃
    private static final int diamond=4;//方块
    private static final int spade=1;//黑桃
    private static final int club=3;//梅花
    private int color;
    private int num;

    public hmk8Poker(int color, int num) {
        this.color = color;
        this.num = num;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getColor() {

        return color;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        String c="";
        switch (color){
            case 4:
                c="方块";
                break;
            case 3:
                c="梅花";
                break;
            case 2:
                c="红桃";
                break;
            case 1:
                c="黑桃";
                break;
        }
        return "Poker{" +
                "花色：=" + c +
                ", 数字=" + num +
                '}';
    }

    @Override
    public int compareTo(hmk8Poker o) {
        if (getColor()<o.getColor()){
            return 1;
        }else if(getColor()>o.getColor()){
            return -1;
        }else{
            if (getNum()>o.getNum())
                return 1;
            else if (getNum()<o.getNum())
                return -1;
            else return 0;
        }
    }


}
