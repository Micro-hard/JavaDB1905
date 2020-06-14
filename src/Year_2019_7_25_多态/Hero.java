package Year_2019_7_25_多态;

public class Hero {
    private String name;
    private int hp;
    private int mp;
    private boolean isLive;
    public void attack(Hero hero){
        hero.setHp(hero.getHp()-1);
    }

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        isLive=true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public String getName() {

        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public boolean isLive() {
        return isLive;
    }
}
