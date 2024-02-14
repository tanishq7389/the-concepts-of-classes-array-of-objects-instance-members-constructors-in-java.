import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("\nEnter student details:");
        System.out.print("PRN: ");
        String prn = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Date of Birth: ");
        String dob = scanner.next();
        System.out.print("Marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(prn, name, dob, marks);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\nList of Students:");
            for (Student student : students) {
                System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DoB: " + student.getDob() + ", Marks: " + student.getMarks());
            }
        }
    }

    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.println("Student found: ");
                System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DoB: " + student.getDob() + ", Marks: " + student.getMarks());
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.next();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found: ");
                System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DoB: " + student.getDob() + ", Marks: " + student.getMarks());
                return;
            }
        }
        System.out.println("Student with Name " + name + " not found!");
    }

    public void searchByPosition() {
        System.out.print("Enter Position to search: ");
        int position = scanner.nextInt();
        if (position >= 0 && position < students.size()) {
            Student student = students.get(position);
            System.out.println("Student found at position " + position + ": ");
            System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DoB: " + student.getDob() + ", Marks: " + student.getMarks());
        } else {
            System.out.println("Invalid position!");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN of student to update: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.print("Enter new name: ");
                String name = scanner.next();
                System.out.print("Enter new date of birth: ");
                String dob = scanner.next();
                System.out.print("Enter new marks: ");
                double marks = scanner.nextDouble();

                student.setName(name);
                student.setDob(dob);
                student.setMarks(marks);
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        String prn = scanner.next();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                students.remove(student);
                System.out.println("Student with PRN " + prn + " deleted successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }
}
