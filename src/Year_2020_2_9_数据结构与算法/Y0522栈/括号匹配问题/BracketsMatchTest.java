package Year_2020_2_9_数据结构与算法.Y0522栈.括号匹配问题;


import Year_2020_2_9_数据结构与算法.Y0522栈.单链表模拟栈.Stack;

import java.util.ArrayList;

public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "上海)()(长安)()";
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配："+match);
    }

    /**
     * 判断str中的括号是否匹配
     * @param str 括号组成的字符串
     * @return 如果匹配，返回true，如果不匹配，返回false
     */
    public static boolean isMatch(String str){
        //创建栈，存储左括号，
        Stack<String> chars=new Stack<>();
        for(int i=0;i<str.length();i++){
            String currChar=str.charAt(i)+"";
            if(currChar.equals("(")){
                chars.push(currChar);
            }else if(currChar.equals(")")){
                //遇到右括号就出栈，如果没有左括号了就返回false
                String pop=chars.pop();
                if(pop==null){
                    return false;
                }
            }
        }
        if(chars.size()!=0){
            return false;
        }
        return true;
    }
}
