package HomeworkMethod;

public class Hero {
    private String name;
    private int poewr=100;

    public void setName(String name) {
        this.name = name;
    }

    public void setPoewr(int poewr) {
        this.poewr = poewr;
    }

    public int getPower(){
        return poewr;
    }

    void go(){
        if(this.poewr==0)
            System.out.println("不能行走,此英雄已死亡");
    }
    void eat(int n){//power最大为100
        this.poewr+=n;
        if(this.poewr>=100)
            this.poewr=100;
    }
    public void hurt(){
        if(this.poewr>=10)
            this.poewr-=10;
    }
    public void hurt(Hero hero){// 方法的重载

    }

    public static void main(String[] args) {
        Hero hero001=new Hero();
        hero001.setName("元");
        hero001.setPoewr(100);
        hero001.hurt();
        hero001.eat(6);
        hero001.go();
        System.out.println(hero001.getPower());
    }
}
