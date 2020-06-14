package Year_2019_7_23.实验五作业;

public class homework4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
