package task1.code;

public class Main {
  public static void main(String[] args) {
    EmployeeSalaryCalculation employeeSalaryCalculation = new EmployeeSalaryCalculation();

    // For tight coupling example
    EmployeeSalaryCalculation.Manager manager = employeeSalaryCalculation.new Manager();
    EmployeeSalaryCalculation.Engineer engineer = employeeSalaryCalculation.new Engineer();
    EmployeeSalaryCalculation.Intern intern = employeeSalaryCalculation.new Intern();

    EmployeeSalaryCalculation.SalaryCalculator tightCalculator = employeeSalaryCalculation.new SalaryCalculator();

    System.out.println("Tightly Coupled Manager Salary: " + tightCalculator.calculateManagerSalary(manager));
    System.out.println("Tightly Coupled Engineer Salary: " + tightCalculator.calculateEngineerSalary(engineer));
    System.out.println("Tightly Coupled Intern Salary: " + tightCalculator.calculateInternSalary(intern));

    // Loosely coupled example
    EmployeeSalaryCalculation.LCManager lcManager = employeeSalaryCalculation.new LCManager();
    EmployeeSalaryCalculation.LCEngineer lcEngineer = employeeSalaryCalculation.new LCEngineer();
    EmployeeSalaryCalculation.LCIntern lcIntern = employeeSalaryCalculation.new LCIntern();

    EmployeeSalaryCalculation.LCSalaryCalculator looseCalculator = employeeSalaryCalculation.new LCSalaryCalculator();

    System.out.println("Loosely Coupled Manager Salary: " + looseCalculator.calculateSalary(lcManager));
    System.out.println("Loosely Coupled Engineer Salary: " + looseCalculator.calculateSalary(lcEngineer));
    System.out.println("Loosely Coupled Intern Salary: " + looseCalculator.calculateSalary(lcIntern));
  }
}
