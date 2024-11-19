package labmid.entity;

import java.util.UUID;

public class Student {
  private UUID id;
  private String name;
  private float fscMarks;
  private float metricMarks;
  private float testMarks;
  private boolean interviewPassed;

  public Student(
      UUID id,
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

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getFscMarks() {
    return fscMarks;
  }

  public void setFscMarks(float fscMarks) {
    this.fscMarks = fscMarks;
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

}
