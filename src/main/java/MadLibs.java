import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputWords = new ArrayList<>();
        List<String> prompts = new ArrayList<>() {{
            add(" celebrity name");
            add(" verb ending in 'ing'");
            add(" noun");
            add("n adjective");
            add("n occupation");
            add("n animal");
            add("n adjective");
            add(" verb ending in 'ing'");
            add(" noun");
        }};
        for (String prompt : prompts) {
            System.out.print("Please enter a" + prompt + ":");
            inputWords.add(" " + scanner.nextLine());
        }


        System.out.println("Select a story to read from: " + "\n" + "1) Terminator");
        if (scanner.nextLine().equalsIgnoreCase("1")) {
            File newFile = new File("src/main/java/newFile.txt");
            Printer printer = new Printer();
            printer.print(inputWords, newFile);
        }


    }
}

