package mx.connecta.string;

public class StringJoiner {
    public static void main(String[] args) {
        // example with delimiter
        java.util.StringJoiner students = new java.util.StringJoiner(" ");
        students.add("Andriana");
        students.add("Munroe");
        students.add("Raimund");
        
        System.out.println("Students:" + students);
        
        // example with another delimiter
        students = new java.util.StringJoiner(", ");
        students.add("Andriana");
        students.add("Munroe");
        students.add("Raimund");
        
        System.out.println("Students:" + students);
        
        // example with delimiter, prefix and suffix
        students = new java.util.StringJoiner(", ", "[", "]");
        students.add("Andriana");
        students.add("Munroe");
        students.add("Raimund");
        
        System.out.println("Students" + students);
    }
}
