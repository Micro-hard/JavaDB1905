package Year_2019_7_23.第四节课oop;

public class JiSuanQi {
    /**
     * @param a
     * @param b
     * @return
     */
    int reduce(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double div(double a, double b) {
        return a / b;
    }

    int operator(int a, int b, String o) {
        int tmp = 0;
        switch (o) {
            case "+": {
                tmp = a + b;
                break;
            }
            case "-": {
                tmp = a - b;
                break;
            }
            case "*": {
                tmp = a * b;
                break;
            }
            case "/": {
                tmp = a / b;
                break;
            }
        }
        return tmp;
    }

    public String getPasswordById(String id) {
        String password = "null";
        return password;
    }

    public String[] getStudent() {
        int[] a;
        return null;
    }

    public String getCurrentTime() {
        return null;
    }

    public boolean isSu(int tmp ) {
        return false;
    }

    public int[] newArray(int[] a, int[] b) {
        return null;
    }

    public int[] addArraynum(int[] a, int tmp) {
        return null;
    }

    public static void main(String[] args) {
        JiSuanQi jisuanqi = new JiSuanQi();
        System.out.println(jisuanqi.reduce(2, 1));
        System.out.println(jisuanqi.operator(100, 200, "+"));
    }
}
