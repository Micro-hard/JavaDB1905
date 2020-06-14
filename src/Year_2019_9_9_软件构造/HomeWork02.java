package Year_2019_9_9_软件构造;

import java.io.*;
import java.util.ArrayList;

public class HomeWork02 {
    private static final int guanJianZi=1;
    private static final int biaoShiFu=2;
    private static final int changShu=3;
    private static final int yunSuanFu=4;
    private static final int jieFu=5;
    private static String input="";//c语言代码
    private static String output="";//往文件写入
    private static String[] SchangShu=null;//关键字
    private static String[] SbiaoShiFu=null;//关键字
    private static String[] SguanJianZi=null;//关键字
    private static String[] SyunSuanFu=null;//运算符
    private static String[] SjieFu=null;//界符
    private static ArrayList guanJianZi_01=new ArrayList();
    private static ArrayList yunSuanFu_04=new ArrayList();
    private static ArrayList jieFu_05=new ArrayList();
    private static ArrayList biaoShiFu_02=new ArrayList();
    private static ArrayList changShu_03=new ArrayList();
    public  static void init(){
//        String[] guanJianZi={"if","else","int","for","return","void","main","scanf","printf"};//关键字
//        String[] yunSuanFu={"+","-","*","/","%","&","="};//运算符
//        String[] jieFu={"\"",",",";","{","}","(",")","[","]"};//界符
        files(new File("C:\\Users\\11466\\Desktop\\软件构造文件\\新建文本文档.txt"));  //文件读入程序
        for (int i=0;i<SguanJianZi.length;i++){
            guanJianZi_01.add(SguanJianZi[i]);
        }
        for (int i=0;i<SyunSuanFu.length;i++){
            yunSuanFu_04.add(SyunSuanFu[i]);
        }
        for (int i=0;i<SjieFu.length;i++){
            jieFu_05.add(SjieFu[i]);
        }
        input=input.replaceAll("[\\t\\r\\n]","");//替换掉tab 回车换行
        while (input.contains("\""+"")){//删掉双引号里的字符串
            //System.out.println("test001");
            for (int i=0;i<input.length();i++){
                int last=0;
                int next=0;
                if (input.charAt(i)=='\"'){
                    //System.out.println("test002");
                    last=i;
                    input.replaceFirst("\""+"","");
                    for (int j=last+1;j<input.length();j++){
                        //System.out.println("test003");
                        if (input.charAt(j)=='\"'){
                            //System.out.println("test004");
                            next=j;
                            input.replaceFirst("\""+"","");
                            input=input.substring(0,last)+input.substring(next+1);  //从0到i-1 加上j+1到最后
                            //System.out.println(input);
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
    public static void files(File file){//读文件
        FileInputStream f=null;
        try {
            f=new FileInputStream(file);
            byte[] b=new byte[f.available()];
            f.read(b);
            input=new String(b);

            f=new FileInputStream(new File("C:\\Users\\11466\\Desktop\\软件构造文件\\baoliuzi.txt"));//保留字文件读入
            b=new byte[f.available()];
            f.read(b);
            SguanJianZi=new String(b).split(",");
            f=new FileInputStream(new File("C:\\Users\\11466\\Desktop\\软件构造文件\\jiefu.txt"));//界符文件读入
            b=new byte[f.available()];
            f.read(b);
            SjieFu=new String(b).split("1");
            f=new FileInputStream(new File("C:\\Users\\11466\\Desktop\\软件构造文件\\yunsuanfu.txt"));//运算符文件读入
            b=new byte[f.available()];
            f.read(b);
            SyunSuanFu=new String(b).split(",");
            //System.out.println(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ShiBie(String str){//识别
        String tmp=null;
        int i=0;
        while (str.length()>0){
            if (Character.isLetter(str.charAt(i))&&(Character.isLetter(str.charAt(i+1))||Character.isDigit(str.charAt(i+1)))){//是字母下一个是字母或数字
                i++;
            }else{
                tmp=str.substring(0,i+1);
                if (guanJianZi_01.contains(tmp)){
                    int index=0;////                 记录在表中的位置
                    for (;index<SguanJianZi.length;index++){
                        if (SguanJianZi[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"("+guanJianZi+","+str.substring(0,i+1)+","+(index+1)+")"+"\r\n";
                    System.out.println("("+guanJianZi+","+str.substring(0,i+1)+","+(index+1)+")");
                }else if (jieFu_05.contains(tmp)) {//从while到这时可能是单个字符 界符，或运算符,或单个数字
                    int index=0;////                 记录在表中的位置
                    for (;index<SjieFu.length;index++){
                        if (SjieFu[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"(" + jieFu + "," + str.substring(0, i + 1) +","+(index+1)+")"+"\r\n";
                    System.out.println("(" + jieFu + "," + str.substring(0, i + 1)+","+(index+1) + ")");
                }else if (yunSuanFu_04.contains(tmp)) {
                    int index=0;////                 记录在表中的位置
                    for (;index<SyunSuanFu.length;index++){
                        if (SyunSuanFu[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"(" + yunSuanFu + "," + str.substring(0, i + 1) +","+(index+1)+ ")"+"\r\n";
                    System.out.println("(" + yunSuanFu + "," + str.substring(0, i + 1) +","+(index+1)+ ")");
                }else if (Character.isDigit(tmp.charAt(0))){//如果这个字符是 单个数字
                    while(true){
                        if (str.length()>0&&Character.isDigit(str.charAt(i))&&Character.isDigit(str.charAt(i+1))){//是数字下一个是数字
                            i++;
                            //System.out.println("testtest");
                        }else break;
                    }

                    if (str.length()>0&&!Character.isDigit(str.charAt(i+1))){//数字结束
                        if (!changShu_03.contains(str.substring(0,i+1)))//常数去重
                            changShu_03.add(str.substring(0,i+1));
                        SchangShu=(String[])changShu_03.toArray(new String[0]);
                        int index=0;
                        for (;index<SchangShu.length;index++){
                            if (SchangShu[index].equals(str.substring(0,i+1)))
                                break;
                        }
                        output=output+"("+changShu+","+str.substring(0,i+1)+","+(index+1)+")"+"\r\n";
                        System.out.println("("+changShu+","+str.substring(0,i+1)+","+(index+1)+")");
                        //System.out.println(str);
                    }
                    //System.out.println("(" + changShu + "," + str.substring(0, i+1) + ")"+"001");
                }else {
                    if (!biaoShiFu_02.contains(str.substring(0,i+1)))//标识符去重
                        biaoShiFu_02.add(str.substring(0,i+1));
                    SbiaoShiFu=(String[])biaoShiFu_02.toArray(new String[0]);
                    int index=0;
                    for (;index<SbiaoShiFu.length;index++){
                        if (SbiaoShiFu[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"("+biaoShiFu+","+str.substring(0,i+1)+","+(index+1)+")"+"\r\n";
                    System.out.println("("+biaoShiFu+","+str.substring(0,i+1)+","+(index+1)+")");
                }
                str=str.substring(i+1);//减掉i+1之前的字符串
                // System.out.println(str);
                i=0;
            }
            if (str.length()>0&&(str.charAt(i)==' '||yunSuanFu_04.contains(str.charAt(i)+"")||jieFu_05.contains(str.charAt(i)+""))){//删除空格运算符界符并判断
                //System.out.println("testt");
                //tmp=str.substring(0,i+1);
                if (yunSuanFu_04.contains(str.charAt(i)+"")){//单个字符加上""才能判断,要不不是字符串
                    int index=0;////                 记录在表中的位置
                    for (;index<SyunSuanFu.length;index++){
                        if (SyunSuanFu[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"("+yunSuanFu+","+str.substring(0,i+1)+","+(index+1)+")"+"\r\n";
                    System.out.println("("+yunSuanFu+","+str.substring(0,i+1)+","+(index+1)+")");
                }else if (jieFu_05.contains(str.charAt(i)+"")){
                    int index=0;////                 记录在表中的位置
                    for (;index<SjieFu.length;index++){
                        if (SjieFu[index].equals(str.substring(0,i+1)))
                            break;
                    }
                    output=output+"("+jieFu+","+str.substring(0,i+1)+","+(index+1)+")"+"\r\n";
                    System.out.println("("+jieFu+","+str.substring(0,i+1)+","+(index+1)+")");
                }
                str=str.substring(1);
                i=0;
                // System.out.println(str);
            }
        }
    }
    public static void fileoutput(String str){
        FileOutputStream out=null;
        try {
            out=new FileOutputStream("C:\\Users\\11466\\Desktop\\软件构造文件\\output.txt",true);
            out.write(output.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        init();
        ShiBie(input);
        fileoutput(output);
        //System.out.println(input);//r回车  n换行
    }
}
/**
 * 1    关键字
 * 2    标识符
 * 3    常数
 * 4    运算符
 * 5    界符
 */
/*   c语言代码
int f(int year,int month,int day)
{
	int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31},i,sum;
	for(i=0,sum=0;i<month;++i)
	{
		sum+=mon[i];
		if(i==2)
		{
			sum+=ISLEAP(year);
		}
	}
	sum+=day;
	return sum;
}
int main(void)
{
	int year,month,day;
	scanf("%d%d%d",&year,&month,&day);
	printf("%d\n",f(year,month,day));
	return 0;
}

 */


/*
        System.out.print("请输入代码：");
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("\n");//可以输入空格
        String input=scanner.next();
        System.out.println(input);
        System.out.println(input.replaceAll(" ",""));
 */
//!yunSuanFu_04.contains(str.charAt(i+1))&&!jieFu_05.contains(str.charAt(i+1))&&str.charAt(i+1)!=' '
