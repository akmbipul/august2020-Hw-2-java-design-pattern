package structural.facade.design.apttern;

public class StatementWriter {
    public void writeHtmlReport(BankStatement statement, String location) {
        statement.getHeader().getHeaderInfo();
        statement.getTransaction().getReportTransacton();
        statement.getBalance().getReportBalance();
        statement.getFooter().getReportFooter();
    }
    public void writePdfReport(BankStatement statement, String location) {
        statement.getHeader().getHeaderInfo();
        statement.getTransaction().getReportTransacton();
        statement.getBalance().getReportBalance();
        statement.getFooter().getReportFooter();
    }
}
