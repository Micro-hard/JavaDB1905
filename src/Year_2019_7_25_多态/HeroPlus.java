package Year_2019_7_25_多态;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnySimpleDV;

public class HeroPlus {
    private String name;
    Pet pet;

    public HeroPlus(String name) {
        this.name = name;
    }

    public HeroPlus(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public void run() {
        if (this.pet instanceof Dog) {
            System.out.println(this.name);
            this.pet.follow();
        } else if (this.pet instanceof Cat) {
            System.out.println(this.name);
            this.pet.follow();
            System.out.println(this.pet.getName());//猫的名字
        } else if (this.pet instanceof Eagle) {
            System.out.println(this.name);
            this.pet.follow();
        } else {
            System.out.println(this.name);
            System.out.println("无宠物");
        }
    }


    public static void main(String[] args) {

        HeroPlus heroPlus = new HeroPlus("李白", new Cat("shit"));
        HeroPlus heroPlus1 = new HeroPlus("张飞");
        heroPlus.run();
        //System.out.println();
        heroPlus1.run();
    }
}
