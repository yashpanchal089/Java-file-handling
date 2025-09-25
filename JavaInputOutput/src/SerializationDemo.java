import java.io.*;

//Step 1: Create a Serializable class
class Student implements Serializable{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}


public class SerializationDemo {
    public static void main(String[] args) {
        String filename = "Student.ser";

        // Step 2: Serialize object (write to file)
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            Student s1 = new Student("Yash", 22);
            out.writeObject(s1);
            System.out.println("Object is serialized");
        }catch (IOException e){
            e.printStackTrace();
        }

        // Step 3: Deserialize object (read from file)

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            Student s2 = (Student) in.readObject();
            System.out.println("Object deserialized");
            System.out.println("Student Name: " + s2.name);
            System.out.println("Student age: " + s2.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
