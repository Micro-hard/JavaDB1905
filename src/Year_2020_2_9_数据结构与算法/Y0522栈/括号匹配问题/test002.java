package Year_2020_2_9_数据结构与算法.Y0522栈.括号匹配问题;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class test002 {

    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

//    public static boolean isValid(String s) {
//        Map<Character,Character> map=new HashMap<Character,Character>();
//        map.put('(',')');
//        map.put('{','}');
//        map.put('[',']');
//
//        Stack stack=new Stack();
//        for(int i=0;i<s.length();i++){
//            if(map.containsKey(s.charAt(i))){
//                stack.push(s.charAt(i));
//            }else{
//                if(stack.size()==0){
//                    return false;
//                }
//                if(s.charAt(i)!=map.get(stack.pop())){
//                    return false;
//                }
//            }
//        }
//        if(stack.size()!=0){
//            return  false;
//        }
//        return true;
//    }

}
