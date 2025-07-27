import java.util.*;
public class StackEx {
    public static void main(String [] args){
        Stack <Integer> stack=new Stack<>();
        //to add elements
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        //to get the peek element
        System.out.println(stack.peek());
        //to remove the element
        System.out.println(stack.pop());
        //to search the element
        System.out.println(stack.search(40));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        //to check the stack is empty is or not
        System.out.println(stack.isEmpty());
    }
}
