package collections.map;
import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        //to add elements
        map.put(10,10);
        map.put(20,20);
        map.put(30,30);
        map.put(40,40);
        map.put(50,50);
        System.out.println(map);
        //to remove the elements
        map.remove(30);
        map.remove(40);
        System.out.println(map);
        //to update the value
        map.put(50,30);
        System.out.println(map);
        //for iterations
        //1.using keySet() method
        for(int key: map.keySet()){
            System.out.print(" key: "+key+" value: "+map.get(key));
        }
        System.out.println();
        //2.using values() method
        for(int value:map.values()){
            System.out.print(value+" ");
        }
    }
    
}
