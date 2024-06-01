package utils;

import java.util.Collection;

public class DisplayDetails<T> {

    void displayDetails(Collection<T> collection){
        for (T coll: collection) {
            System.out.println(coll);
        }
    }
    void displayDetails(T[] array){
        for (T elem: array){
            System.out.println(elem);
        }
    }
}
