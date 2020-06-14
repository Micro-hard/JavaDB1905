package Year_2019_7_26多态作业;

public class WorldMori {
    public int dayNumber(int year){
        if(year/400==0||(year/4==0&&year/100!=0))//判断某年的天数
            return 366;
        return 365;
    }
    public static void main(String[] args) {
        int year=2000;
        int sum=0;
        WorldMori worldMori=new WorldMori();
        //System.out.println(worldMori.dayNumber(2000));
        while(true){
            sum+=worldMori.dayNumber(year);
            if(((sum+1)%7==0)&&(year%10==9&&year/10%10==9))//周日并且xx99年
                break;
            else
                year++;
        }
        System.out.println(year);
    }
}
