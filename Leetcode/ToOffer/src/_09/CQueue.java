package _09;

import java.util.Stack;

/**
 * @author ：Rwto
 * @date ：Created in 2021/6/27 22:03
 * @description：用两个栈实现队列
 */
public class CQueue {

    private Stack<Integer> stack1 ;
    private Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else{

            return stack2.pop();
        }
    }
}
