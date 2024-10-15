package task1.code;

public class EmployeeSalaryCalculation {
  /**
   * Tight or High Coupling
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
   * Loose or low Coupling
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
}
