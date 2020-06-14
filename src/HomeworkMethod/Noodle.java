package HomeworkMethod;

public class Noodle {
    private String width;
    private int size;
    private boolean beef;
    private int egg;
    public Noodle(String width,int size,boolean beef,int egg){
//        this.width="中";
//        this.size=8;
//        this.beef=false;
          this.size=size;
          this.beef=beef;
          this.width=width;
          this.egg=egg;
    }
    void show(){
        System.out.println("宽度:"+this.width+"尺寸："+this.size+"蛋数:" +this.egg);
        System.out.println(this.beef?"加肉":"不加肉");
    }

    public static void main(String[] args) {
        Noodle noodle=new Noodle("中",8,false,1);
        noodle.show();
    }
}
