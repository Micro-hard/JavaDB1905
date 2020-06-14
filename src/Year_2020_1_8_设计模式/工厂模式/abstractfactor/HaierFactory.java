package Year_2020_1_8_设计模式.工厂模式.abstractfactor;

public class HaierFactory  extends EleFactory{
    @Override
    public Fridge getFridge() {
        return new HaierFridge();
    }

    @Override
    public Tv getTv() {
        return new HaierTv();
    }

    @Override
    public WashingMachine getwm() {
        return new HaierWashingMachine();
    }
}
