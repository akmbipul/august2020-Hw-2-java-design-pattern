package structural.facade.design.apttern;

public class TransactionStatement {
    public void getReportTransacton(){
        System.out.println("Opening Balance For This Month:  $5000");
        System.out.println("07-01-2020                       +5000");
        System.out.println("07-10-2020                      -10000");
        System.out.println("07-19-2020                      +16000");
        System.out.println("07-28-2020                      -10000");
        System.out.println("--------------------------------------");
    }

}
