package mx.connecta.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class WalkDirectories {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/connecta/Codes/java-8/src/main/java/mx/connecta/");
        
        // walk the directory and subdirectory entries
        try(Stream<Path> stream = Files.walk(path, 2)) {
            
            stream.forEach(System.out::println);

        } catch (IOException ex) {
            Logger.getLogger(ListDirectories.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
