package Year_2020_2_9_数据结构与算法._001稀疏数组;

import java.io.*;
import java.util.Arrays;

public class SparseArray {  //P9稀疏数组
    //当一个数组中大部分元素相同时可以使用稀疏数组来包村改数组；

    public static void main(String[] args) throws IOException {
        //创建原始二维数组   11*11
        //0：表示没有棋子，1：黑子 2：蓝子
        int[][] array1=new int[11][11];
        array1[1][2]=1;
        array1[1][3]=2;
        array1[5][5]=2;

        //输出原数组
        System.out.println("原数组~~~");
        for(int[] row:array1){
            for(int col:row){
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }

        //遍历二维数组得到非零数据的个数
        int sum=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

        //创建稀疏数组
        int[][] sparseArray=new int[sum+1][3];
        //给稀疏数组赋值
        sparseArray[0][0]=11;//总行数，总列数，非零数
        sparseArray[0][1]=11;
        sparseArray[0][2]=sum;

        //遍历二维数组将非零的数存到sparseArray中
        //第一个非零数据放在稀疏数组的第二行
        int count=0;  //用于记录是第几个非零数据
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(array1[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;//横坐标
                    sparseArray[count][1]=j;//纵坐标
                    sparseArray[count][2]=array1[i][j];//值
                }
            }
        }

        //输出稀疏数组
        System.out.println("得到的稀疏数组为~~~");
        for(int i=0;i<sparseArray.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }

        //IO存入文件
        PrintWriter pw=new PrintWriter("d:/array.txt","utf-8");
        for(int i=0;i<sparseArray.length;i++){
            for(int j=0;j<sparseArray[0].length;j++){
                pw.print(sparseArray[i][j]+"    ");
            }
            pw.println();
        }
        pw.close();
        System.out.println("稀疏数组存盘成功");

        //从文件读出(可以按行进行)
        int[][] newSparseArray=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("d:/array.txt"),"utf-8"));
        int row=0;//新的稀疏数组的行数
        String line=null;
        while((line=br.readLine())!=null){
            row++;
        }
        newSparseArray=new int[row][3];

        BufferedReader br1=new BufferedReader(new InputStreamReader(new FileInputStream("d:/array.txt"),"utf-8"));
        int r=0;
        while ((line=br1.readLine())!=null){//一次读一行
            String[] col=line.split("   ");
            for(int i=0;i<col.length;i++){//i<3
                newSparseArray[r][i]=Integer.parseInt(col[i]);//赋值
            }
            r++;
        }
        br.close();
        br1.close();
        System.out.println("稀疏数组读取成功");


        //将稀疏数组恢复为原始的二维数组
        int[][] array2=new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i=1;i<sparseArray.length;i++){
            array2[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }

        //恢复的数组~~~
        System.out.println("恢复的数组~~~");
        for(int[] row2:array2){
            for(int col:row2){
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }
    }
}
