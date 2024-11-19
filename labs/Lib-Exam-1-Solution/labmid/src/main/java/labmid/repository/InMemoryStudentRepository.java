package labmid.repository;

import labmid.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentRepository implements StudentRepository<Student, Long> {
  private final List<Student> students = new ArrayList<>();

  @Override
  public List<Student> findByTestMarksGreaterThanEqual(int marks) {
    return students.stream()
        .filter(student -> student.getTestMarks() >= marks)
        .toList();
  }

  @Override
  public List<Student> findByInterviewPassed(boolean passed) {
    return students.stream()
        .filter(student -> student.isInterviewPassed() == passed)
        .toList();
  }

  public void saveAll(List<Student> studentList) {
    students.addAll(studentList);
  }
}
