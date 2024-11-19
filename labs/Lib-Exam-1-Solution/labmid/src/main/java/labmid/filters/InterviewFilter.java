package labmid.filters;

import java.util.stream.Collectors;
import labmid.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;



/**
 * InterviewFilter
 */
@Service
public class InterviewFilter {
  public List<Student> filterForInterview(List<Student> students) {
    return students.stream()
        .filter(student -> student.isInterviewPassed())
        .collect(Collectors.toList());
  }
}
