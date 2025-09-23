import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        try{
            File file = new File("testfile.txt");

            //create file
            if (file.createNewFile()){
                System.out.println("File is created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            // check the properties
            System.out.println("File Exists ?" + file.exists());
            System.out.println("Writable " + file.canWrite());
            System.out.println("If already Exits Delete it : " + file.delete() );
            System.out.println("Create new file : " + file.createNewFile());
            System.out.println("Readig file :"+ file.setReadOnly());


            if(file.canWrite()){
                BufferedWriter bw = new BufferedWriter(new FileWriter("testfile1.txt"));
                bw.write("Line 1: Hello Yash");
                bw.newLine();
                bw.write("Line 2: Java is Fun");
                bw.close();
            } else {
                System.out.println("It's in read mode");
            }
                BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
                String line;
                System.out.println("Reading file with testfile.txt :");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
