package Year_2020_1_8_设计模式.装饰模式;

public abstract class Decorator implements Person{
  //引用一个被推荐的人
    Person p;

    public Decorator(Person p){
        super();
        this.p=p;
    }
}
