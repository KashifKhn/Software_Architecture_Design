package labmid.observer;

import labmid.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class StudentObserver implements NotificationObserver {
  @Override
  public void notify(List<Student> students, String message) {
    students.forEach(student -> System.out.println("Notifying " + student.getName() + ": " + message));
  }

}
