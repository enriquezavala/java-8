package mx.connecta.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {       
        List<String> students = new ArrayList<>();
        students.add("Lanny");
        students.add("Stefanie");
        students.add("Foster");
        students.add("Hal");
        students.add("Katherine");

        // simple lambda expression
        students.forEach(student -> System.out.println(student));
        
        // lambda expression with more than one line
        students.forEach(student -> {
                if("Katherine".equals(student)) {
                    System.out.println("\nWelcome again Katherine");
                }
            });
        
        // lambda expression with 2 parameters
        Comparator<String> compareName = 
            (String s1, String s2) -> s1.compareTo(s2);
        
        Collections.sort(students, compareName);      
        System.out.println("\nSorting students:" + students);
    }
}