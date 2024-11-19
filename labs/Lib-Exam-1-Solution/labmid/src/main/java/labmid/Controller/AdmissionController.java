package labmid.Controller;

import java.util.List;
import java.util.stream.Collectors;

import labmid.dto.StudentDto;
import labmid.entity.Student;
import labmid.service.AdmissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admissions")
public class AdmissionController {

  private final AdmissionService admissionService;

  public AdmissionController(AdmissionService admissionService) {
    this.admissionService = admissionService;
  }

  @PostMapping("/apply")
  public ResponseEntity<String> applyForAdmission(@RequestBody List<StudentDto> studentDTOs) {
    List<Student> students = studentDTOs.stream()
        .map(dto -> new Student(dto.getName(), dto.getFscMarks(), dto.getMetricMarks(), dto.getTestMarks()))
        .collect(Collectors.toList());
    System.out.println("apply called:   " + students.toString());

    admissionService.processAdmission(students);
    return ResponseEntity.ok("Admission process completed. Notifications sent.");
  }

  // @GetMapping("/test")
  // public ResponseEntity<Map<String, List<Student>>>
  // getTestResults(@RequestParam String notify) {
  // return null;
  // }
  //
  // @GetMapping("/interview")
  // public ResponseEntity<Map<String, List<Student>>>
  // getInterviewResults(@RequestParam String notify) {
  // return null;
  // }
  //
  // @GetMapping("/merit-list")
  // public ResponseEntity<Map<String, List<Student>>> getMeritList(@RequestParam
  // String notify) {
  // return null;
  // }
}
