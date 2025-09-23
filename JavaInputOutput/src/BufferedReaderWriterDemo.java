import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("Line 1: Hello Yash");
            bw.newLine();
            bw.write("Line 2: Java is Fun");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
            String line;
            System.out.println("Reading file with BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
