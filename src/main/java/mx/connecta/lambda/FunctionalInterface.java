package mx.connecta.lambda;

import java.io.File;
import java.io.FileFilter;

public class FunctionalInterface {
    public static void main(String[] args) {
        File directory = new File("/Users/connecta/Codes/java-8/src/main/java/mx/connecta/lambda/");
        
        // lambda expression from FileFilter functional interface
        FileFilter filter = (File pathname) -> pathname.getName().endsWith(".java");
        
        File[] files = directory.listFiles(filter);       
        for(File file: files) {
            System.out.println(file);
        }
    }
}
