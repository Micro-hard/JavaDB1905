package Year_2019_7_23.第三节课;

/**
 * 桶排序
 */
public class tongpaixu {
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
