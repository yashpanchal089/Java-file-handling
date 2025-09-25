import java.io.*;

public class FileOperationDemo {
    public static void main(String[] args) {
        //Creating a file

        try{
            File file = new File("Operation.txt");

            if(file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

        //Getting a file information
        File file = new File("Operation.txt");
        if(file.exists()){
            System.out.println("File name : " + file.getName());
            System.out.println("Writable : " + file.canWrite());
            System.out.println("Path : " + file.getAbsolutePath());
            System.out.println("Readable : " + file.canRead());
            System.out.println("File size in bytes : " + file.length());
        } else {
            System.out.println("File does not exists");
        }

        //Deleting a File
        File file1 = new File("Operation.txt");
        if(file1.delete()){
            System.out.println("Deletd files : " + file1.getName());
        } else {
            System.out.println("Failed to delete");
        }




    }
}
