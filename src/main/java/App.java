import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/olegmonogarov/IdeaProjects/Exceptions_lecture_2/gradlew");
             FileWriter writer = new FileWriter("test")) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("copy successfully");

    }
}

