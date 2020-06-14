package Year_2019_7_23.第三节课;

public class arrayzonghe {
    public static void main(String[] args) {
        int [] scores={1,2,5,8,744,20,-2};
        int sum=0;
        //int min=0;
        int min=scores[0];
        for (int i=0;i<scores.length;i++) {
            if(scores[i]<min)
                min=scores[i];
            sum += scores[i];
        }
        System.out.println(sum/scores.length+" "+min);
    }
}
