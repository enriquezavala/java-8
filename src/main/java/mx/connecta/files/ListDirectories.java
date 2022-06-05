package mx.connecta.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ListDirectories {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/connecta/Codes/java-8/src/main/java/mx/connecta/");
        
        // list the directory entries
        try(Stream<Path> stream = Files.list(path)) {
            
            stream.forEach(System.out::println);

        } catch (IOException ex) {
            Logger.getLogger(ListDirectories.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
