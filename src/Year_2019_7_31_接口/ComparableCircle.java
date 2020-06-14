package Year_2019_7_31_接口;

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(int r) {
        super(r);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ComparableCircle) {
            if (this.getR() == ((ComparableCircle) o).getR())
                return 0;
            else if (this.getR() > ((ComparableCircle) o).getR())
                return 1;
            else
                return -1;
        }
        return 0;
    }
}
