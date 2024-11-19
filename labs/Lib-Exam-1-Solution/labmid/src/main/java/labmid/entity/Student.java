package labmid.entity;

public class Student {
  private Long id;
  private String name;
  private float fscMarks;
  private float metricMarks;
  private float testMarks;
  private boolean interviewPassed;

  public Student(
      Long id,
      String name,
      float fscMarks,
      float metricMarks,
      float testMarks,
      boolean interviewPassed) {
    this.id = id;
    this.name = name;
    this.fscMarks = fscMarks;
    this.metricMarks = metricMarks;
    this.testMarks = testMarks;
    this.interviewPassed = interviewPassed;
  }

  public Student(
      String name,
      float fscMarks,
      float metricMarks,
      float testMarks) {
    this.name = name;
    this.fscMarks = fscMarks;
    this.metricMarks = metricMarks;
    this.testMarks = testMarks;
  }

  public double calculateFinalScore() {
    return (fscMarks * 0.4) + (metricMarks * 0.1) + (testMarks * 0.5);
  }

  public float getMetricMarks() {
    return metricMarks;
  }

  public void setMetricMarks(float metricMarks) {
    this.metricMarks = metricMarks;
  }

  public float getTestMarks() {
    return testMarks;
  }

  public void setTestMarks(float testMarks) {
    this.testMarks = testMarks;
  }

  public boolean isInterviewPassed() {
    return interviewPassed;
  }

  public void setInterviewPassed(boolean interviewPassed) {
    this.interviewPassed = interviewPassed;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
