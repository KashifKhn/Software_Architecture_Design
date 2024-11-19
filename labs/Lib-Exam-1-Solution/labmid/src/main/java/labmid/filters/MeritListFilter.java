package labmid.filters;

import java.util.List;
import java.util.stream.Collectors;
import labmid.entity.Student;
import org.springframework.stereotype.Service;
import java.util.Comparator;

@Service
public class MeritListFilter implements PipeFilter {

  @Override
  public List<Student> filter(List<Student> students) {
    return students.stream()
        .sorted(Comparator.comparingDouble(Student::calculateFinalScore).reversed())
        .collect(Collectors.toList());
  }
}
