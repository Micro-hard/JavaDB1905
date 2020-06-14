package Year_2019_7_25_多态;

public class LoL {
    public static void main(String[] args) {
        Hero Libai=new CiKe("李白",356,120,40,100);
        Hero kai=new ZhanShi("凯",450,120,40,50);
        Hero ake =new CiKe("阿珂",389,100,40,100);
        Libai.attack(kai);
        Libai.attack(ake);
        System.out.println("凯血量"+kai.getHp());
        System.out.println("阿珂的血量"+ake.getHp());
    }
}
