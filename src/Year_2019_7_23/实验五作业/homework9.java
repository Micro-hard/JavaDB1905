package Year_2019_7_23.实验五作业;

public class homework9 {
    public static void main(String[] args) {
        int watermelon=1020;
        int day=0;
        while(watermelon!=0){
            watermelon-=watermelon/2+2;
            day++;
        }
        System.out.println("卖了"+day+"天");
    }
}
