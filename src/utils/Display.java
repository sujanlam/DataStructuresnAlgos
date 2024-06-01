package utils;

import java.util.List;
import java.util.Stack;

public class Display<T> {

    public static <T> void display(List<T> collection){
        for (T coll: collection) {
            System.out.print(coll+" ");
        }
    }
    public static <T> void display(T[] array){
        for (T elem: array){
            System.out.print(elem);
        }
    }
    public static <T> void display(Stack<T> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
