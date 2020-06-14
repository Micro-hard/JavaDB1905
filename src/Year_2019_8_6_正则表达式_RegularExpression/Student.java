package Year_2019_8_6_正则表达式_RegularExpression;

/**
 * 张三#001#90-李四#002#60-王二麻子#003#20
 */
public class Student {
    private String name;
    private String ID;
    private int score;

    public Student(String name, String ID, int score) {
        this.name = name;
        this.ID = ID;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", score=" + score +
                '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public String getID() {
        return ID;
    }

    public int getScore() {
        return score;
    }
    public static Student[] getStudents(String str){
        Student[] stu=null;
        if (str.indexOf("-")==-1){
            return null;
        }else{
            String[] s=str.split("-");
            stu=new Student[s.length];
            for (int i=0;i<s.length;i++){
                //张三#001#90
                System.out.println(s[i]);
                String[] temp=s[i].split("#");
                stu[i]=new Student(temp[0],temp[1],Integer.parseInt(temp[2]));
            }
        }
        return stu;
    }
    public static void printURLNameAndValue(String url){
        //name=oracle&gender=1&adminType=0
        url=url.substring(url.indexOf("?")+1);
        String []s1=url.split("&");
        String [][]s2=new String[url.length()][2];
        for (int i=0;i<s1.length;i++){
            s2[i]=s1[i].split("=");
            System.out.println(s2[i][0]+" "+s2[i][1]);
        }
    }

    public static void main(String[] args) {
        Student[] s=getStudents("张三#001#90-李四#002#60-王二麻子#003#20");

        for (int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }
        Student.printURLNameAndValue("name=oracle&gender=1&adminType=0");

    }
}

