package students.model;

import java.util.ArrayList;

public class StudentModel {
  ArrayList<Student> studentList = new ArrayList<>();

  public void addStudent(Student student) {
    studentList.add(student);
  }

  public void addStudents(ArrayList<Student> students) {
    studentList.addAll(students);
  }

  public Student getStudentById(int id) {
    for (Student stu : studentList) {
      if (stu.getId() == id) {
        return stu;
      }
    }

    return null;
  }

  public Student getStudentByName(String name) {
    for (Student stu : studentList) {
      if (stu.getName().equals(name)) {
        return stu;
      }
    }
    return null;
  }

  public boolean deleteStudent(String name) {
    Student student = getStudentByName(name);
    if (student == null) {
      return false;
    }
    studentList.remove(student);
    return true;
  }

  public boolean deleteStudent(int id) {
    Student student = getStudentById(id);
    if (student == null) {
      return false;
    }
    studentList.remove(student);
    return true;
  }

  public ArrayList<Student> getAllStudent() {
    return studentList;
  }

}
