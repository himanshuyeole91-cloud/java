import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String textToAppend = "This is the new appended line.\n";

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(textToAppend);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
