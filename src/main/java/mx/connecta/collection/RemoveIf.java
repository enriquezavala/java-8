package mx.connecta.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Lanny");
        students.add("Stefanie");
        students.add("Foster");
        students.add("Hal");
        students.add("Katherine");
        
        students.removeIf(student -> "Katherine".equals(student));
        students.forEach(System.out::println);
    }
}
