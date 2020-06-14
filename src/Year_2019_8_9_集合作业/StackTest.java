package Year_2019_8_9_集合作业;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("asdf");
        stack.push(1);
        stack.push(666);
        stack.push(888);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
