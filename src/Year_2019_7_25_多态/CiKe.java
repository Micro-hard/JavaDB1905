package Year_2019_7_25_多态;

public class CiKe extends Hero {
    private int speed;//移速
    private int power;//攻击力

    public CiKe(String name, int hp, int mp, int speed, int power) {
        super(name, hp, mp);
        this.speed = speed;
        this.power = power;
    }

    @Override
    public void attack(Hero hero) {////////////////////////////////////强转
        if (hero instanceof ZhanShi) {//判断是不是战士类型  变量名 instanceof 类名//写类名时 注意要有继承关系，否则编译出错
            ZhanShi zs=(ZhanShi) hero;  //父类强制转成子类
            zs.setHp(zs.getHp()+zs.getHujia()-this.power);
        } else {
            hero.setHp(hero.getHp() - power);
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {

        return speed;
    }

    public int getPower() {
        return power;
    }
}
