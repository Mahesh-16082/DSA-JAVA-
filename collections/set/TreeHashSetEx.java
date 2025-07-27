package collections.set;
import java.util.*;
public class TreeHashSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> tset=new TreeSet<>();
        HashSet<Integer> tset1=new LinkedHashSet<>();
        //to add element to set
        tset.add(20);
        tset.add(30);
        tset.add(40);
        tset.add(50);
        tset1.add(60);
        tset1.add(70);
        tset1.add(80);
        tset1.add(90);
        //to add set of elements
        tset.addAll(tset1);
        System.out.println(tset);
        //to remove element
        tset.remove(50);
        System.out.println(tset);
        //iterations 
        //1.dynamic loop
        for(int i: tset){
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator <Integer> itr=tset.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
     }
}

