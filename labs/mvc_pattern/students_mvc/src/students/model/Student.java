package students.model;

public class Student {

  private String name;
  private String regno;
  private int id;
  private int age;

  public Student(String name, String regno, int id, int age) {
    this.name = name;
    this.regno = regno;
    this.id = id;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegno() {
    return regno;
  }

  public void setRegno(String regno) {
    this.regno = regno;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        ", id=" + id +
        "name= '" + name + '\'' +
        ", regno= '" + regno + '\'' +
        ", age=" + age +
        '}';
  }
}
