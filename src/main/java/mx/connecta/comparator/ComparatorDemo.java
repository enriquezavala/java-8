package mx.connecta.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cole", "Grutchfield"));
        students.add(new Student("Rebekah", "Goschalk"));
        students.add(new Student("Giffie", "Liffe"));
        students.add(new Student("Clarance", "Grutchfield"));
        
        // students sorted by last name
        Comparator<Student> compareLastName = Comparator.comparing(Student::getLastName);
        students.sort(compareLastName);
        students.forEach(System.out::println);
        
        System.out.println();
               
        // students sorted by last name and first name
        Comparator<Student> compareLastNameThenFirstName = 
            Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName);
        students.sort(compareLastNameThenFirstName);
        students.forEach(System.out::println);
        
        System.out.println();
        
        // reverse comparator
        Comparator<Student> reverseCompareLastName = compareLastName.reversed();
        students.sort(reverseCompareLastName);
        students.forEach(System.out::println);
        
        System.out.println();
        
        // compare natural order
        List<Integer> grades = Arrays.asList(9, 7, 8, 9, 10);
        Comparator<Integer> compareNaturalOrder = Comparator.naturalOrder();
        grades.sort(compareNaturalOrder);
        System.out.println(grades);
        
        System.out.println();
        
        // compare with null values
        List<String> teachers = Arrays.asList("Lettie", "Ewart", "Lincoln", null);
        teachers.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        teachers.forEach(System.out::println);    
    }
}
