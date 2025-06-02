import java.util.ArrayList;
import java.util.List;
class Student {
    String name;
    int id;
    String course;
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}
class College {
    List<Student> students = new ArrayList<>();
    public void addStudent(int id, String name, String course) {
        students.add(new Student(id, name, course));
        System.out.println("Student Added Successfully!");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }
        System.out.println("List of Students:");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}
public class CollegeManagement {
    public static void main(String[] args) {
        College college = new College();
        college.addStudent(101, "Alice", "Computer Science");
        college.addStudent(102, "Bob", "Mechanical Engineering");
        college.displayStudents();
    }
}