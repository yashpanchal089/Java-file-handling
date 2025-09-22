import java.io.*;

public class BinaryStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("example.bin");
        fos.write(66);
        fos.close();

        FileInputStream fis = new FileInputStream("example.bin");
        int data = fis.read();
        System.out.println((char)data);
        fis.close();

    }
}