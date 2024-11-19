package labmid.service;

import java.util.List;
import labmid.entity.Student;
import labmid.observer.NotificationObserver;
import org.springframework.stereotype.Service;
import java.util.ArrayList;



@Service
public class NotificationService {
  private final List<NotificationObserver> observers = new ArrayList<>();

  public void registerObserver(NotificationObserver observer) {
    observers.add(observer);
  }

  public void notifyObservers(List<Student> students, String message) {
    for (NotificationObserver observer : observers) {
      observer.notify(students, message);
    }
  }
}
