import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Hello yash Welcome to java I/O");
            writer.close();
            System.out.println("Data written to file");

            FileReader reader = new FileReader("myfile.txt");
            int ch;
            System.out.println("Reading file content");
//            while ((ch = reader.read()) != -1) {
//                System.out.println((char) ch);
//            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
