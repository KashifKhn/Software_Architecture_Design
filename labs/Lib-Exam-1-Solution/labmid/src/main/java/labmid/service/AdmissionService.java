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
  private final TestFilter testFilter;
  private final InterviewFilter interviewFilter;
  private final MeritListFilter meritListFilter;
  private final NotificationService notificationService;
  private final StudentRepository studentRepository;

  public AdmissionService(EligibilityFilter eligibilityFilter, TestFilter testFilter,
      InterviewFilter interviewFilter, MeritListFilter meritListFilter,
      NotificationService notificationService, StudentRepository studentRepository) {
    this.eligibilityFilter = eligibilityFilter;
    this.testFilter = testFilter;
    this.interviewFilter = interviewFilter;
    this.meritListFilter = meritListFilter;
    this.notificationService = notificationService;
    this.studentRepository = studentRepository;
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
