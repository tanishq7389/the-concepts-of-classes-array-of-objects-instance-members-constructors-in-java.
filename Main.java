// Name: Tanishq Jain
// PRN: 22070126119
// Batch: 2022-26

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    studentManager.searchByPRN();
                    break;
                case 4:
                    studentManager.searchByName();
                    break;
                case 5:
                    studentManager.searchByPosition();
                    break;
                case 6:
                    studentManager.updateStudent();
                    break;
                case 7:
                    studentManager.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}
