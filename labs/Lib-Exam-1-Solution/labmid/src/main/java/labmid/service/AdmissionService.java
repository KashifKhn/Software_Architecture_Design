package labmid.service;

import labmid.entity.Student;
import labmid.filters.EligibilityFilter;
import labmid.filters.InterviewFilter;
import labmid.filters.MeritListFilter;
import labmid.filters.PipeFilter;
import labmid.filters.TestFilter;
import labmid.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdmissionService {
  private final PipeFilter eligibilityFilter;
  private final PipeFilter testFilter;
  private final PipeFilter interviewFilter;
  private final PipeFilter meritListFilter;
  private final NotificationService notificationService;

  public AdmissionService(
      PipeFilter eligibilityFilter,
      PipeFilter testFilter,
      PipeFilter interviewFilter,
      PipeFilter meritListFilter,
      NotificationService notificationService) {
    this.eligibilityFilter = eligibilityFilter;
    this.testFilter = testFilter;
    this.interviewFilter = interviewFilter;
    this.meritListFilter = meritListFilter;
    this.notificationService = notificationService;
  }

  public void processAdmission(List<Student> students) {
    List<Student> eligibleStudents = eligibilityFilter.filter(students);

    notificationService.notifyObservers(eligibleStudents, "Eligible for the test.");

    List<Student> testPassedStudents = testFilter.filter(eligibleStudents);
    notificationService.notifyObservers(testPassedStudents, "Passed the test. Schedule your interview.");

    List<Student> interviewPassedStudents = interviewFilter.filter(testPassedStudents);
    notificationService.notifyObservers(interviewPassedStudents, "Passed the interview. Await merit list.");

    List<Student> meritList = meritListFilter.filter(interviewPassedStudents);
    notificationService.notifyObservers(meritList, "Congratulations! You are admitted.");
  }
}
