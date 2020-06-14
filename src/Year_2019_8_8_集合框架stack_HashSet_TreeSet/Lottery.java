package Year_2019_8_8_集合框架stack_HashSet_TreeSet;

import java.util.*;

public class Lottery {              //彩票         5个红球   一个篮球
    private Set<Integer> red;//红球
    private int blue=0;//篮球

    /*public Lottery() {

        blue=new Random().nextInt(33)+1;

        red=new HashSet();                             //Set不能重复
        while(red.size()!=6){
            red.add(new Random().nextInt(36)+1);
        }

    }*/

    @Override
    public String toString() {
        return "Lottery{" +
                "red=" + red +
                ", blue=" + blue +
                '}'+'\n';
    }

    public void setRed(Set<Integer> red) {
        this.red = red;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public Set<Integer> getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }
    public Lottery getOne(){
        TreeSet reds=new TreeSet();
        while(reds.size()!=6){
            reds.add(new Random().nextInt(36)+1);
        }
        Lottery one=new Lottery();
        one.setRed(reds);
        one.setBlue(new Random().nextInt(33)+1);
        return one;
    }
    public ArrayList<Lottery> getMore(int count){
        ArrayList l=new ArrayList();
        for (int i=0;i<count;i++){
            l.add(getOne());
        }
        return l;
    }
}
