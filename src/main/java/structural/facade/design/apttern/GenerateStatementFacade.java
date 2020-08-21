package structural.facade.design.apttern;

import javax.sql.DataSource;

public class GenerateStatementFacade {
    public static void generateReport(StatementType type, TransactionStatement transaction, String location)
    {
        if(type == null || transaction == null)
        {
            //throw some exception
        }
        //Create report
        BankStatement bankStatement = new BankStatement();

        bankStatement.setHeader(new HeaderStatement());
        bankStatement.setTransaction(new TransactionStatement());
        bankStatement.setBalance(new BalanceOfStatement());
        bankStatement.setFooter(new FooterStatement());


        //Write report
        StatementWriter writer = new StatementWriter();
        switch(type)
        {
            case HTML:
                writer.writeHtmlReport(bankStatement, location);
                break;

            case PDF:
                writer.writePdfReport(bankStatement, location);
                break;
        }
    }

}
