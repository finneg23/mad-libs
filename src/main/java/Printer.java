import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Printer {
    private File newFile;

    public void print (List inputWords, File newFile) {
        try (Scanner reader = new Scanner(newFile)) {
            int i = 0;
            while (reader.hasNextLine()) {
                System.out.print(reader.nextLine());
                while (i < inputWords.size()) {
                    System.out.println(inputWords.get(i));
                    i++;
                    break;
                }
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
