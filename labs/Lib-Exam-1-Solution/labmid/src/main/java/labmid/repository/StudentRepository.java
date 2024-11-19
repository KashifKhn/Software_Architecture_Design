package labmid.repository;

import java.util.List;

public interface StudentRepository<Student, Long> {
  List<Student> findByTestMarksGreaterThanEqual(int marks);

  List<Student> findByInterviewPassed(boolean passed);
}
