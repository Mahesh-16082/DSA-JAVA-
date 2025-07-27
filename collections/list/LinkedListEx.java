import java.util.*;

public class LinkedListEx {
    public static void main(String args[]){
        List <Integer> list1=new LinkedList<>();
        // to add the value in Linkedlist
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        System.out.println(list1);
        //to add at particular position in Linkedlist
        list1.add(4,80);
        System.out.println(list1);
        //to add element at first position in Linkedlist
        list1.addFirst(10);
        //to add element at last position in Linkedlist
        list1.addLast(100);
        //to update the elements in the Linkedlist
        list1.set(4,90);
        System.out.println(list1);
        //to delete the elements in the Linkedlist
        list1.remove(4);
        System.out.println(list1);
        //to delete the first element in the LinkedList
        list1.removeFirst();
        System.out.println(list1);
        //to delete the last element in the LinkedList
        list1.removeLast();
        System.out.println(list1);
        // Iterating over the Linkedlist
        // 1.for loop using size() method
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        //2.using dynamic for loop
        for(int i: list1){
            System.out.print(i+" ");
        }
        System.out.println();
        //3.using iterator class method
        Iterator<Integer> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
