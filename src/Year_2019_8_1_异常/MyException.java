package Year_2019_8_1_异常;

public class MyException extends Exception{
    private int IdNumber;
    public MyException(String errormsg,int id){
        super(errormsg);//构造方法
        this.IdNumber=id;
    }
    public MyException(int id){
        super("不能为负数");
        this.IdNumber=id;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public static void main(String[] args) {

    }
}
