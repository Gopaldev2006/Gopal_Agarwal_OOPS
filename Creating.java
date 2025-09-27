// 
import java.io.FileWriter;
import java.io.IOException;

public class Creating {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Files in Java might be tricky, but it is fun enough!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}