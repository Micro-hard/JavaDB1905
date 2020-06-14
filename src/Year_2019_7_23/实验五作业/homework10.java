package Year_2019_7_23.实验五作业;

public class homework10 {
    public static void main(String[] args) {
        int sum=1;
        int day=9;
        while(day>=1){
            sum+=sum+2;
            day--;
        }
        System.out.println("摘了"+sum+"个");
    }
}
