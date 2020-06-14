package JavaStudy;

import java.util.Stack;

public class StackTest<E> {
    private int[] stack = new int[10];
    private int tos;

    //Initialize top-of-stack 初始为-1
    StackTest(int size)
    {
        stack=new int[size];
        tos--;
    }

    void push(int item) {
        if (tos == stack.length-1) {
            System.out.println("Stack is full.");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public static void main(String[] args) {
        StackTest mystack1 = new StackTest(10);
        StackTest mystack2 = new StackTest(10);
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}
