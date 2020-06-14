package Year_2019_8_12_多线程;

import java.util.Calendar;
import java.util.Date;

public class HappyBirthday implements Runnable{
    private int hour;
    private int min;
    public HappyBirthday(int i, int i1) {
        hour=i;
        min=i1;
    }

    @Override
    public void run() {
        Calendar calendar=Calendar.getInstance();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (calendar.get(Calendar.HOUR)==hour&&calendar.get(Calendar.MINUTE)==min){
            System.out.println("happy birthday");
        }
        }
    }

    public static void main(String[] args) {
        HappyBirthday happyBirthday=new HappyBirthday(16,49);
        Thread t1=new Thread(happyBirthday,"生日线程");
        t1.start();
    }
}
