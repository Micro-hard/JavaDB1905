package Year_2019_7_26多态作业;

public class Array {
    public static void main(String[] args) {
        int[] a = {2, 5, 9};
        int[][] b = {{9, 8, 7}, {4, 5, 6}, {1, 2, 3}};
        int [] c={40,50,60};
        int [] d=new int[c.length+1];////////////////////
        int tmp=0;
        for (int i=0; i < a.length; i++)
            a[i] += 3;
        for (int i=0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }

        }
        for (int i=0;i<d.length-1;i++){
            d[0]=30;
            d[i+1]=c[i];
        }
        for (int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }


        int sum=1;
        for (int i=1;i<11;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
