package hashTable;

import java.util.*;

public class HashTables {
    public static void main(String[] args) {
        HashMap<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "Shawn");
        mapp.put(2, "Robin");
        mapp.put(3, "John");
        Hashtable<Integer, String> table = new Hashtable<>(10, .75f);
        table.put(1, "Shawn");
        table.put(2, "Robin");
        table.put(3, "John");

        for(Map.Entry<Integer, String> entry: mapp.entrySet()){
            //System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }
        System.out.println();
        for(Map.Entry<Integer, String> entry: table.entrySet()){
            //System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }

        mapp.forEach((k, v) -> System.out.println("Key is: "+k+" "+v));
    }
}
