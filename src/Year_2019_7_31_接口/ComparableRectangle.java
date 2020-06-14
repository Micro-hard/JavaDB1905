package Year_2019_7_31_接口;


public class ComparableRectangle extends Rectangle implements CompareOblectRectangle {
    public ComparableRectangle(int length, int width) {
        super(length, width);
    }
    public int compareTo(Object o){
        if (o instanceof Rectangle){
            if (this.getLength()*this.getWidth()==((Rectangle) o).getLength()*((Rectangle) o).getWidth())
                return 0;
            else if (this.getLength()*this.getWidth()>((Rectangle) o).getLength()*((Rectangle) o).getWidth())
                return 1;
            else
                return -1;
        }
        return 0;
    }
}
