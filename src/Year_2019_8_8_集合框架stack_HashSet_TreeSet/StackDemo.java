package Year_2019_8_8_集合框架stack_HashSet_TreeSet;

import java.util.Stack;

/**
 * 栈
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.get(0));
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
