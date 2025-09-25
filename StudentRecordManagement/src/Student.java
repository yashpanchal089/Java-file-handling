import java.io.Serializable;

public class Student implements Serializable {
    private final String name;
    private final int age;
    private final double marks;

    public Student(int age, String name, double marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student{Name ='"+ name +"', Age=" + age + ", Marke = " + marks + "}";
    }
}
