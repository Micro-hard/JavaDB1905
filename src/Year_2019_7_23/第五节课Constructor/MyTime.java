package Year_2019_7_23.第五节课Constructor;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime(int huor,int minute,int second){//构造
        this.hour=huor;
        this.minute=minute;
        this.second=second;
    }
    public void display(){
        System.out.println(this.hour+"时" +this.minute+"分" +this.second+"秒");
    }

    public void addHour(int hou){
        this.hour+=hou;
        if(this.hour>=24){
            this.hour%=24;
        }
    }
    public void subHour(int hou){
        this.hour-=hou;
        if(this.hour<=0){
            this.hour=(-this.hour)%24;
            //this.hour=0;
        }
    }
    public void addSecond(int sec){
        this.second+=sec;
        if(this.second>59){
            addMinute(this.second/60);
            this.second=this.second%60;
        }
    }
    public void subSecond(int sec){//     秒31
        this.second-=sec;
        if(this.second<0){
            subMinute((-this.second)/60+1);
            this.second=60-(-(this.second)%60);
        }
    }
    public void addMinute(int min){
        this.minute+=min;
        if(this.minute>59){
            addHour(this.minute/60);
            this.minute=this.minute%60;
        }

    }
    public void subMinute(int min){
        this.minute-=min;
        if(this.minute<0){
            subHour((-this.minute)/60+1);
            this.minute=60-(-(this.minute%60));
        }
    }

    public static void main(String[] args) {
        MyTime a=new MyTime(12,30,30);
        a.addSecond(30000);
        a.display();
        a.subSecond(30000);
        a.display();
    }
}
