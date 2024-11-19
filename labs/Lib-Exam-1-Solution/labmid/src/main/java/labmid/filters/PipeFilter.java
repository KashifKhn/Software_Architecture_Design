package labmid.filters;

import java.util.List;

import labmid.entity.Student;

public interface PipeFilter {

  public List<Student> filter(List<Student> students);

}
