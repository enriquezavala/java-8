package mx.connecta.collection;

import java.util.Arrays;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Lanny","Stefanie","Foster","Hal","Katherine");
        
        // forEach method from Iterable class
        students.forEach(System.out::println);
    }
}
