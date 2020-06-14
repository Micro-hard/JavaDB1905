package Year_2019_7_25_多态;

public class Animal {
     int legs;
     public void display(){
         System.out.println("腿："+legs);
     }
    public static void main(String[] args) {
        Animal kongque = new Bird(2);
        kongque.legs=2;
        kongque.display();
        int []x=new int[4];
    }
}
