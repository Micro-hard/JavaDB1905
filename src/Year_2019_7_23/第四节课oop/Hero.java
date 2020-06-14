package Year_2019_7_23.第四节课oop;

public class Hero {
    int hp;
    String name;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    void attack(Hero temp){
        temp.setHp(temp.getHp()-1);
    }

    public static void main(String[] args) {
        Hero hero1=new Hero();
        Hero hero2=new Hero();
        hero1.setName("李白");
        hero1.setHp(100);
        hero2.setName("凯");
        hero2.setHp(100);
        hero1.attack(hero2);
        hero2.attack(hero2);
        System.out.println("凯"+hero2.getHp());
    }
}
