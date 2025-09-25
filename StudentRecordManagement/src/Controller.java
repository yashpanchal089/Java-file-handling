import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        List<Student> students = new ArrayList<>();

        try {
            Student s1 = manager.createStudent();
            students.add(s1);

            Student s2 = manager.createStudent();
            students.add(s2);

            manager.saveToTextFile(students);

            manager.readFromTextFile();

            manager.serializeStudents(students);

            List<Student> deserialized = manager.deserializeStudents();
            System.out.println("\nDeserialized Students : ");
            for (Student s : deserialized) {
                System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
