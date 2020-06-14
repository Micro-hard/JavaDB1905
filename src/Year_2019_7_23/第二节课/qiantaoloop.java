package Year_2019_7_23.第二节课;

public class qiantaoloop {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++)
                if (i >= j)
                    System.out.printf(j + "*" + i + "=" + i * j + "  ");
        }
        for (int i=1;i<9;i++){
            System.out.println();
            for (int j=1;j<9;j++)
                if(i>=j)
                System.out.print("* ");
        }
        //System.out.printf("%7d",a);

    }
}
