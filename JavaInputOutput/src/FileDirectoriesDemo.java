import java.io.File;
import java.io.IOException;

public class FileDirectoriesDemo {
    public static void main(String[] args) throws IOException {

        File dir = new File("MyFolder");

        dir.mkdir();
        File file1 = new File(dir, "DirMakeFile1.txt");
        File file2 = new File(dir, "DirMakeFile2.txt");
        System.out.println("File Created :"  + (file1.createNewFile() ? "Created" : "exists"));
        System.out.println("File Created :"  + (file2.createNewFile() ? "Created" : "exists"));


        //List files inside the directory
        String[] files = dir.list();
        if(files != null){
            System.out.println("Files in directory");
            for (String f : files){
                System.out.println(f);

            }
        }
    }
}
