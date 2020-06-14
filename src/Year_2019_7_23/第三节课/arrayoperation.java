package Year_2019_7_23.第三节课;
/**
 * 添加 删除 组合
 */
public class arrayoperation {
    public static void main(String[] args) {
        int[] x ={1,2,3};
        int[] z={4,5,6,7};
        int[] ss=new int[7];
        int new_int = 4;
        int[] y = new int[x.length + 1];//新的数组
        for (int i=0;i<x.length;i++){
            y[i+1]=x[i];
        }
        y[0]=4;
        //for (int tmp:y)
         //   System.out.print(tmp+" ");
        int j=0;
        for (int i=0;i<7;i++){
            if(i<3)
                ss[i]=x[i];
            else {
                ss[i] = z[j];
                j++;
            }
        }
        for (int tmp:ss)
            System.out.print(tmp+" ");
    }
}
