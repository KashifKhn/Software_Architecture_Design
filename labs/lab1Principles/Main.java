public class Main {

  /**
   * High (Tight) Coupling Example
   */
  class Manager {
    public double getBaseSalary() {
      return 80000;
    }
  }

  class Engineer {
    public double getBaseSalary() {
      return 60000;
    }
  }

  class Intern {
    public double getBaseSalary() {
      return 30000;
    }
  }

  class SalaryCalculator {
    public double calculateManagerSalary(Manager manager) {
      return manager.getBaseSalary() + 5000;
    }

    public double calculateEngineerSalary(Engineer engineer) {
      return engineer.getBaseSalary() + 3000;
    }

    public double calculateInternSalary(Intern intern) {
      return intern.getBaseSalary();
    }
  }

  /**
   * Low (Loose) Coupling Example
   */
  interface Employee {
    double getBaseSalary();
  }

  class LCManager implements Employee {
    public double getBaseSalary() {
      return 80000;
    }
  }

  class LCEngineer implements Employee {
    public double getBaseSalary() {
      return 60000;
    }
  }

  class LCIntern implements Employee {
    public double getBaseSalary() {
      return 30000;
    }
  }

  class LCSalaryCalculator {
    public double calculateSalary(Employee employee) {
      return employee.getBaseSalary();
    }
  }

  public static void main(String[] args) {
    Main mainClass = new Main(); // Create an instance of the main class to access inner classes.

    // --- High Coupling Example ---
    Manager manager = mainClass.new Manager();
    Engineer engineer = mainClass.new Engineer();
    Intern intern = mainClass.new Intern();

    SalaryCalculator highCouplingCalculator = mainClass.new SalaryCalculator();

    System.out.println("High Coupling Manager Salary: " + highCouplingCalculator.calculateManagerSalary(manager));
    System.out.println("High Coupling Engineer Salary: " + highCouplingCalculator.calculateEngineerSalary(engineer));
    System.out.println("High Coupling Intern Salary: " + highCouplingCalculator.calculateInternSalary(intern));

    // --- Low Coupling Example ---
    LCManager lcManager = mainClass.new LCManager();
    LCEngineer lcEngineer = mainClass.new LCEngineer();
    LCIntern lcIntern = mainClass.new LCIntern();

    LCSalaryCalculator lowCouplingCalculator = mainClass.new LCSalaryCalculator();

    System.out.println("Low Coupling Manager Salary: " + lowCouplingCalculator.calculateSalary(lcManager));
    System.out.println("Low Coupling Engineer Salary: " + lowCouplingCalculator.calculateSalary(lcEngineer));
    System.out.println("Low Coupling Intern Salary: " + lowCouplingCalculator.calculateSalary(lcIntern));
  }
}
