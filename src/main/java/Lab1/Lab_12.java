/*
    ---------Student class :
                            Variables: Name,Id
    ---------Student_Info class
                            Methods:
                                    *add student(name,ID)
                                    *Search student(ID)
                                    *It prints student name of the ID

 */
package Lab1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author md karim
 */
class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}
class Student_Info {
    private final Map<Integer, Student> studentMap;
    public Student_Info() {
        studentMap = new HashMap<>();
    }
    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        studentMap.put(id, student);
    }
    public String searchStudent(int id) {
        Student student = studentMap.get(id);
        if (student != null) {
            return student.getName();
        } else {
            return "Student not found";
        }
    }
}
public class Lab_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student_Info studentInfo = new Student_Info();
        while (true) {
            System.out.println(" ");
            System.out.println("Choose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Search student by ID");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name:");
                    String name = input.nextLine();
                    System.out.print("Enter student ID:");
                    int id = input.nextInt();
                    studentInfo.addStudent(name, id);
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.print("Enter student ID to search:");
                    int searchId = input.nextInt();
                    String studentName = studentInfo.searchStudent(searchId);
                    System.out.println("Student Name: " + studentName);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}