package labmid.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository<Student, UUID> {
  List<Student> findByTestMarksGreaterThanEqual(int marks);

  List<Student> findByInterviewPassed(boolean passed);
}
