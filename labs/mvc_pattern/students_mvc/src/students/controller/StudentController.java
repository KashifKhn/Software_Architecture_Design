package students.controller;

import students.model.Student;
import students.model.StudentModel;
import students.view.StudentView;

import java.util.List;

public class StudentController {

  private final StudentModel studentModel;
  private final StudentView studentView;

  public StudentController(StudentModel studentModel, StudentView studentView) {
    this.studentModel = studentModel;
    this.studentView = studentView;
  }

  public void addStudent(Student student) {
    studentModel.addStudent(student);
    System.out.println("Student added successfully.");
  }

  public void displayAllStudents() {
    List<Student> students = studentModel.getAllStudent();
    if (students.isEmpty()) {
      System.out.println("No students available.");
    } else {
      studentView.displayAllStudents(students);
    }
  }

  public void displayStudentById(int id) {
    Student student = studentModel.getStudentById(id);
    if (student == null) {
      System.out.println("Student with ID " + id + " not found.");
    } else {
      studentView.displayStudent(student);
    }
  }

  public void displayStudentByName(String name) {
    Student student = studentModel.getStudentByName(name);
    if (student == null) {
      System.out.println("Student with name " + name + " not found.");
    } else {
      studentView.displayStudent(student);
    }
  }

  public void deleteStudentById(int id) {
    boolean isDeleted = studentModel.deleteStudent(id);
    if (isDeleted) {
      System.out.println("Student with ID " + id + " deleted successfully.");
    } else {
      System.out.println("Student with ID " + id + " not found.");
    }
  }

  public void deleteStudentByName(String name) {
    boolean isDeleted = studentModel.deleteStudent(name);
    if (isDeleted) {
      System.out.println("Student with name " + name + " deleted successfully.");
    } else {
      System.out.println("Student with name " + name + " not found.");
    }
  }
}
