package Year_2020_1_19_java复习$$$$._007Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PukerSuit {  //一副扑克牌
    List<Puker> list=new ArrayList<Puker>();
    public PukerSuit(){
        //初始化52张排
        for(int i=0;i<52;i++){
            list.add(new Puker(i%4,i/4));
        }
    }

    public Puker get(int index){
        return list.get(index);
    }

    //显示
    public void disp(){
        for (Puker p:list){
            System.out.println(p);
        }
    }

    public void shuffle(){
        Collections.shuffle(list);
    }

    public void sort(){
        Collections.sort(list);
    }

    public void sortByValue(){
        Collections.sort(list,new ValueComparator());
    }

    public void compare(Puker p1,Puker p2){
        ValueComparator cmp=new ValueComparator();
        int result=cmp.compare(p1,p2);
        System.out.println();
        if(result>0){
            System.out.println(p1+">"+p2);
        }else if (result<0){
            System.out.println(p1+"<"+p2);
        }else{
            System.out.println(p1+"="+p2);
        }

    }
}
