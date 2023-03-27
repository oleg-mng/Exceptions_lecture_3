import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (FileReader test = new FileReader("/Users/olegmonogarov/IdeaProjects/Exceptions_lecture_2/gradlew")){
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        }
    }
}
