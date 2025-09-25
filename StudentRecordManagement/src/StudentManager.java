import java.io.*;
import java.util.List;

public class StudentManager {
    private static final String TEXT_FILE = "students.txt";
    private static final String SERIAL_FILE = "students.ser";

    //Add student using console input
    public Student createStudent() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name");
        String name = br.readLine();
        System.out.println("Enter Age");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Marks");
        double marks = Double.parseDouble(br.readLine());

        return new Student(age, name, marks);
    }

    // Save to text file using BufferedWriter (Character Stream)
    public void saveToTextFile(List<Student> students) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(TEXT_FILE));
        for(Student s : students){
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
        System.out.println("Students saved to " + TEXT_FILE);
    }

    // Read from text file using BufferedReader

    public void readFromTextFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE));
        String line;
        System.out.println("\nReading from text file");
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    // Serialize students to file (Binary Stream)
    public void serializeStudents(List<Student> students) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE));
        oos.writeObject(students);
        oos.close();
        System.out.println("Students serialized to " + SERIAL_FILE);
    }

    // Deserialize students from file
    public List<Student> deserializeStudents() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE));
        List<Student> students = (List<Student>) ois.readObject();
        ois.close();
        return students;
    }







}
