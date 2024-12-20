package labmid.filters;

import java.util.List;
import java.util.stream.Collectors;
import labmid.entity.Student;

import org.apache.catalina.Pipeline;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class EligibilityFilter implements PipeFilter {

  @Override
  public List<Student> filter(List<Student> students) {
    return students.stream()
        .filter(student -> student.getFscMarks() >= 70 && student.getMetricMarks() >= 60)
        .collect(Collectors.toList());
  }
}
