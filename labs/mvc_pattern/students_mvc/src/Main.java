import students.controller.StudentController;
import students.model.Student;
import students.model.StudentModel;
import students.view.StudentView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id = 1;
        StudentModel studentModel = new StudentModel();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentModel, studentView);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display Student by ID");
            System.out.println("4. Display Student by Name");
            System.out.println("5. Delete Student by ID");
            System.out.println("6. Delete Student by Name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter registration number: ");
                    String regno = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Student newStudent = new Student(name, regno, id, age);
                    studentController.addStudent(newStudent);
                    id++;
                    break;

                case 2:
                    studentController.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int idToSearch = scanner.nextInt();
                    studentController.displayStudentById(idToSearch);
                    break;

                case 4:
                    System.out.print("Enter student name: ");
                    String nameToSearch = scanner.nextLine();
                    studentController.displayStudentByName(nameToSearch);
                    break;

                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    studentController.deleteStudentById(idToDelete);
                    break;

                case 6:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    studentController.deleteStudentByName(nameToDelete);
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}