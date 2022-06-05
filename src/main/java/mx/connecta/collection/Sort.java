package mx.connecta.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Lanny");
        students.add("Stefanie");
        students.add("Foster");
        students.add("Hal");
        students.add("Katherine");
        
        students.sort(Comparator.naturalOrder());
        students.forEach(System.out::println);
    }
}
