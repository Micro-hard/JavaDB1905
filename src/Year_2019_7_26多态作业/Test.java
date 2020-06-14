package Year_2019_7_26多态作业;

public class Test {
    public void displayGeometricObject(GeometricObject geometricObject){

            System.out.println("面积："+geometricObject.findArea());
        /*if(geometricObject instanceof Circle)
            System.out.println("圆的面积："+geometricObject.findArea());
        else if(geometricObject instanceof MyRectangle)
            System.out.println("长方形的面积："+geometricObject.findArea());*/
    }
    public boolean equalsArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
        if (geometricObject1.findArea()==geometricObject2.findArea())
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Test q=new Test();
        GeometricObject one=new Circle("绿",6,10);
        GeometricObject three=new Circle("绿",6,10);
        GeometricObject two=new MyRectangle("绿",6,10,8);
        q.displayGeometricObject(one);
        q.displayGeometricObject(two);
        System.out.println(q.equalsArea(one,three)?"面积相等":"面积不相等");
    }
}
