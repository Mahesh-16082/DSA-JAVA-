package collections.set;

import java.util.*;

public class HashSetEx {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
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
        Iterator <Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
     }
}
