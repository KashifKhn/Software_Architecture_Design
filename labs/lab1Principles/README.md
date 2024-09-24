# **Low Coupling in Software Design**

This document focus on **Low Coupling** which is part of the **GRASP (General Responsibility Assignment Software Patterns)** principles.
We also provid real-world examples to explain the concept.

## **What is Coupling?**

In software engineering, the word **coupling** refer to to describe the dependency between modules. When a modules collaborates with another modules, there is some sort of dependency between them and therefore they are coupled to each other.

- **High Coupling**: High Coupling refer to the high degree of dependency between modules. This makes the system rigid, hard to modify, and difficult to maintain. Some time also called **Tight Coupling**.
- **Low Coupling**: Low Coupling refer to the lower degree of dependency. This makes the system more flexible, easier to extend, and maintainable. Some time also called **Loose Coupling**.

## **Why is Low Coupling Important?**

Achieving low coupling allows for better **modularity**. The more independent each component of a system is, the easier it is to:

1. **Maintain**: Since changes in one module are less likely to affect others.
2. **Extend**: Adding new functionality becomes simpler without breaking existing code.
3. **Test**: Isolating modules for testing becomes easier it especially for mock objects or stubs.
4. **Reuse**: Reusable components can be created that are not dependent on other parts of the system.

---

## **Example 1: Employee Salary Calculation**

### **Wrong Approach (High Coupling)**

In this case, the `SalaryCalculator` is tightly coupled to specific employee types (`Manager`, `Engineer`, `Intern`), making the system hard to extend.

### **Problems with High Coupling**:

- **Hard to Extend**: Adding new roles requires modifying `SalaryCalculator`.
- **Code Duplication**: Each employee type has its own method.
- **Inflexible**: Difficult to maintain and test.

---

### **Correct Approach (Low Coupling)**

Creating a common `Employee` interface, we extract the salary calculation logic from specific employee types.

### **Benefits of Low Coupling**:

- **Scalable**: New roles can be added without modifying `SalaryCalculator`.
- **Easier to Test**: The calculation logic can be tested independently of employee roles.
- **Flexible**: Salary calculation logic is now centralized and easier to manage.

---

## **Example 2: Report Generation System**

### **Wrong Approach (High Coupling)**

In this case, the `ReportService` is directly dependent on specific report formats (`PDFReport`, `ExcelReport`, `CSVReport`). This results in high coupling as new report formats would require changes in the `ReportService`.

### **Problems with High Coupling**:

- **Direct Dependency**: The `ReportService` is tied to specific report formats, making it harder to extend.
- **Code Duplication**: Each report format has its own method.
- **Hard to Maintain**: Updating or adding formats requires modifying the `ReportService`.

---

### **Correct Approach (Low Coupling)**

We refactor the system by introducing a `ReportGenerator` interface, and each report format implements this interface. Now the `ReportService` depends on this interface, reducing coupling.

### **Benefits of Low Coupling**:

- **Extensible**: New report formats can be added without modifying `ReportService`.
- **Testable**: Mock `ReportGenerator` implementations can be used for testing.
- **Simplified Logic**: Centralized report generation logic with reduced duplication.

---

## **Summary**

Achieving **Low Coupling** in software design helps build more flexible, maintainable, and extensible systems. By minimizing dependencies between modules, we can easily adapt to changes, reduce complexity, and improve the overall quality of the codebase. This principle plays a key role in improving the architecture of any software system, ensuring that changes or extensions can be made without disrupting the entire structure.

## **Note**

It may be impossible to eliminate coupling but you should strive to minimize it.

## **How To Run Code**

To run Code You Can use the any Terminal/shell

```
javac ./code/Main.java
java ./code/Main
```

also there will or Multiple Example in Code folder
