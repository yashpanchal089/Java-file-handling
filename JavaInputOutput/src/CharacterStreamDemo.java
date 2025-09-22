import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt");
        writer.write("Hello Universe");
        writer.close();

        FileReader reader = new FileReader("example.txt");
        int ch;
        while ((ch = reader.read()) != -1){
            System.out.println((char) ch);
        }
        reader.close();
    }
}
