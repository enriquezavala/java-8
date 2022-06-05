package mx.connecta.lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Lanny");
        students.add("Stefanie");
        students.add("Foster");
        students.add("Hal");
        students.add("Katherine");
        
        // lambda expression (method reference)
        students.forEach(System.out::println);
    }
}
