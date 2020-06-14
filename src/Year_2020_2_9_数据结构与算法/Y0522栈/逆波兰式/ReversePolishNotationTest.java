package Year_2020_2_9_数据结构与算法.Y0522栈.逆波兰式;

import Year_2020_2_9_数据结构与算法.Y0522栈.单链表模拟栈.Stack;

public class ReversePolishNotationTest {

    public static void main(String[] args) {
        //中缀表达式 3*（17-15）+18/6 的逆波兰表达式如下 6+3=9
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = caculate(notation);
        System.out.println("逆波兰表达式的结果为：" + result);
    }

    /**  逆波兰式求值，
     * @param notaion 逆波兰表达式的数组表示方式
     * @return 逆波兰表达式的计算结果
     */
    public static int caculate(String[] notaion) {
        Stack<Integer> oprands=new Stack<>();
        for (int i = 0; i < notaion.length; i++) {
            String curr=notaion[i];
            Integer o1;
            Integer o2;
            Integer result;
            //注意栈，应该后面的减前面的（ O2- O1），！！！！！！！！！！！！！！！！！！！！！！
            switch (curr){
                case "+":
                    o1=oprands.pop();
                    o2=oprands.pop();
                    result=o2+o1;
                    oprands.push(result);
                    break;
                case "-":
                    o1=oprands.pop();
                    o2=oprands.pop();

                    result=o2-o1;
                    oprands.push(result);
                    break;
                case "*":
                    o1=oprands.pop();
                    o2=oprands.pop();
                    result=o2*o1;
                    oprands.push(result);
                    break;
                case "/":
                    o1=oprands.pop();
                    o2=oprands.pop();
                    result=o2/o1;
                    oprands.push(result);
                    break;
                default://操作数 进栈，
                    oprands.push(Integer.parseInt(curr));
                    break;
            }
        }
        Integer result=oprands.pop();
        return result;
    }

}
