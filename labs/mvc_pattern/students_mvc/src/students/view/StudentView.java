package students.view;

import students.model.Student;

import java.util.List;

public class StudentView {
  public void displayAllStudents(List<Student> student) {
    for (Student stu : student) {
      System.out.println(stu.toString());
    }
  }

  public void displayStudent(Student student) {
    System.out.println(student.toString());
  }

}
