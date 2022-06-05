package mx.connecta.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/connecta/Codes/java-8/src/main/java/mx/connecta/files/students.txt");
        
        // an easier way to read lines
        try(Stream<String> stream = Files.lines(path)) {
            
            stream.filter(line -> line.contains("Harvard"))
                    .forEach(System.out::println);
        
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
