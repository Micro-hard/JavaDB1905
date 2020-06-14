package HomeworkMethod;

public class JiSuanQi {
    public boolean isSu(int tmp){
        boolean isSu=true;
        for (int j=2;j<tmp;j++){//只要发现一个因数就不是素数
            if (tmp%j==0){
                isSu=false;
                break;
            }
        }
        return isSu;
    }
    int factorial(int i){
        if (i==1)
            return 1;
        if(i>=2)
            return factorial(i-1)*i;
        return -1;
    }

    public static void main(String[] args) {
        JiSuanQi jiSuanQi=new JiSuanQi();
        System.out.println(jiSuanQi.factorial(5));
        System.out.println(jiSuanQi.isSu(7)?"是素数":"不是素数");
        //jiSuanQi.isSu(520)
    }
}
