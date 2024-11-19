package labmid.filters;

import java.util.stream.Collectors;
import labmid.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class TestFilter {
  public List<Student> filterForTestResults(List<Student> students) {
    return students.stream()
        .filter(student -> student.getTestMarks() >= 50)
        .collect(Collectors.toList());
  }
}
