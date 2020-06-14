package Year_2019_7_25_多态;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void follow(){
        System.out.println("宠物跟随");
    }
}
