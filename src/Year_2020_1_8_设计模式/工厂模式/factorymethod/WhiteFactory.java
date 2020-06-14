package Year_2020_1_8_设计模式.工厂模式.factorymethod;

import Year_2020_1_8_设计模式.工厂模式.Human;
import Year_2020_1_8_设计模式.工厂模式.WhiteHuman;

public class WhiteFactory extends Factory{

    @Override
    public Human getHuman() {
        return new WhiteHuman();
    }
}
