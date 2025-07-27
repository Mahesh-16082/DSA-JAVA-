package collections.set;
import java.util.*;
public class LinkedHashSetEx {
    public static void main(String args[]){
        HashSet<Integer> set=new LinkedHashSet<>();
        HashSet<Integer> set1=new LinkedHashSet<>();
        //to add element to set
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set1.add(60);
        set1.add(70);
        set1.add(80);
        set1.add(90);
        //to add set of elements
        set.addAll(set1);
        System.out.println(set);
        //to remove element
        set.remove(50);
        System.out.println(set);
        //iterations 
        //1.dynamic loop
        for(int i: set){
            System.out.print(i+" ");
        }
        System.out.println();
        //2.iterator
        Iterator <Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
     }
}
