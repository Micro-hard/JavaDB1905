package api;

public class DanCi {
    public static void main(String[] args) {

    String []str1={"home","apple","banana","happy"};
        for (int i=0;i<str1.length;i++){
            str1[i]=(str1[i].charAt(0)+"").toUpperCase()+str1[i].substring(1);////****/////*****/////
            System.out.println(str1[i]);
        }

    }

}
