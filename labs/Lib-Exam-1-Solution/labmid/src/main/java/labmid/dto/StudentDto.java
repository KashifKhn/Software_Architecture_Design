package labmid.dto;

public class StudentDto {

  private String name;
  private float fscMarks;
  private float metricMarks;
  private float testMarks;

  public StudentDto(String name, float fscMarks, float metricMarks, float testMarks) {
    this.name = name;
    this.fscMarks = fscMarks;
    this.metricMarks = metricMarks;
    this.testMarks = testMarks;
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

}
