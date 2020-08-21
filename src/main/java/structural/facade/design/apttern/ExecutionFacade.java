package structural.facade.design.apttern;

public class ExecutionFacade {
    public static void main(String[] args) {

        GenerateStatementFacade generateStatementFacade = new GenerateStatementFacade();
        System.out.println("Generating HTML Statement : ");
        generateStatementFacade.generateReport(StatementType.HTML, null, null);

        System.out.println("Generating PDF Statement : ");
        generateStatementFacade.generateReport(StatementType.PDF, null, null);

    }
}
