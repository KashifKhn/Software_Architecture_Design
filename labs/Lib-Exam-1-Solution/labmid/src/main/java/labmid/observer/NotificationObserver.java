package labmid.observer;

import labmid.entity.Student;
import java.util.List;


public interface NotificationObserver {
  void notify(List<Student> students, String message);
}
