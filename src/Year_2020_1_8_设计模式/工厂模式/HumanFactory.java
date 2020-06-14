package Year_2020_1_8_设计模式.工厂模式;

public class HumanFactory {
    public Human getHuman(String type){
        if("white".equals(type)){
            return new WhiteHuman();
        }else {
            return new BlackHuman();
        }
    }
}
