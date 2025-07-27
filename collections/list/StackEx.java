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
        //to iterate the elements
        //1.using for loop
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
        //2.using dynamic for loop
        for(int i: stack){
            System.out.print(i+" ");
        }
        System.out.println();
        //3. using iterator class
        Iterator<Integer> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        //to check the stack is empty is or not
        System.out.println(stack.isEmpty());
    }
}
