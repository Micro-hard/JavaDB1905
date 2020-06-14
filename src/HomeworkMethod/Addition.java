package HomeworkMethod;

public class Addition {
    public int Addition(int ...nums){
        int sum=0;
        for (int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }
    public float Addition(float ...nums){
        int sum=0;
        System.out.println("0000");
        for (int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }
    public double Addition(double ...nums){
        int sum=0;
        System.out.println("1111");
        for (int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }

    public long Addition(long ...nums){
        int sum=0;
        for (int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }

    public static void main(String[] args) {
        Addition test =new Addition();
        System.out.println(test.Addition(1,2,3,4,5));
        System.out.println(test.Addition(0.5,2,3,4,5));
        //System.out.println(test.Addition(1.0,2,3,4,5));
    }
}
