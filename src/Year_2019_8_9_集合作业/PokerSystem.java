package Year_2019_8_9_集合作业;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class PokerSystem {
    private ArrayList<hmk8Poker> pokers;

    public void setPokers(ArrayList<hmk8Poker> pokers) {
        this.pokers = pokers;
    }

    public ArrayList<hmk8Poker> getPokers() {

        return pokers;
    }

    public PokerSystem() {
        generatePokers();
    }
    public void generatePokers(){
        pokers=new ArrayList<>();
        for (int i=1;i<=4;i++)
            for (int j=1;j<=13;j++){
                pokers.add(new hmk8Poker(i,j));
            }
    }
    public void washPoker(){
        Collections.shuffle(pokers);
    }

    public static void main(String[] args) {
        PokerSystem ps=new PokerSystem();
        System.out.println(ps.getPokers());
        ps.washPoker();
        System.out.println(ps.getPokers());
        TreeSet<hmk8Poker> pokers=new TreeSet<hmk8Poker>(ps.getPokers());
        System.out.println(pokers);
    }
}
