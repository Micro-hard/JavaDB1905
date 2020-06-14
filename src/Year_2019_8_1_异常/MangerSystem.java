package Year_2019_8_1_异常;

public class MangerSystem {
    public void register(int id) throws MyException {
        if (id < 100) {
            throw new MyException(id);
        }else{
            System.out.println("恭喜你注册成功");
        }

    }
    public void manager(){
        try{
            register(-1);
        }catch (MyException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MangerSystem().manager();
        System.out.println(System.currentTimeMillis());
    }
}
