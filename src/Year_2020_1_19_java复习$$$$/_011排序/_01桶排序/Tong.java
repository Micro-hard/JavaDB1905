package Year_2020_1_19_java复习$$$$._011排序._01桶排序;

public class Tong {
    public static void main(String[] args) {
        int[] scores = {1, 2, 5, 8, 5, 9};
        int[] tong = new int[10];//容器
        for (int i = 0; i < scores.length; i++)
            tong[scores[i]]++;
        for (int i =tong.length-1; i >0; i--) {
            while (tong[i] != 0) {
                tong[i]--;
                System.out.println(i);
            }
        }
    }
}
