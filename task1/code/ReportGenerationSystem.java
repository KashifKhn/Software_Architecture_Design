package task1.code;

public class ReportGenerationSystem {

  /**
   * Tight or High Coupling
   */
  class PDFReport {
    public void generate() {
      System.out.println("Generating PDF Report...");
    }
  }

  class ExcelReport {
    public void generate() {
      System.out.println("Generating Excel Report...");
    }
  }

  class CSVReport {
    public void generate() {
      System.out.println("Generating CSV Report...");
    }
  }

  class ReportService {
    public void generatePDFReport() {
      new ReportGenerationSystem().new PDFReport().generate();
    }

    public void generateExcelReport() {
      new ReportGenerationSystem().new ExcelReport().generate();
    }

    public void generateCSVReport() {
      new ReportGenerationSystem().new CSVReport().generate();
    }
  }

  /**
   * Loose or Low Coupling
   */
  interface ReportGenerator {
    void generate();
  }

  class LCPDFReport implements ReportGenerator {
    public void generate() {
      System.out.println("Generating PDF Report...");
    }
  }

  class LCExcelReport implements ReportGenerator {
    public void generate() {
      System.out.println("Generating Excel Report...");
    }
  }

  class LCCSVReport implements ReportGenerator {
    public void generate() {
      System.out.println("Generating CSV Report...");
    }
  }

  class LCReportService {
    private ReportGenerator reportGenerator;

    public LCReportService(ReportGenerator reportGenerator) {
      this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
      reportGenerator.generate();
    }
  }

}
