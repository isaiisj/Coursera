import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File myTest = new File(“src/myTestFile.txt”);
        try {
            FileInputStream inputStream = new FileInputStream(myTest);

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(“File Not Found!”);
        }
    }
}
