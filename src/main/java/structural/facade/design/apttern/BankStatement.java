package structural.facade.design.apttern;

/*
  Facade Design Pattern is a category of Structural pattern.

  The Facade pattern is appropriate when we have a complex system that we want to expose to clients
  in a simplified way.

  Please implement Facade Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.

 */
public class BankStatement {
    private HeaderStatement header;
    private BalanceOfStatement balance;
    private FooterStatement footer;
    private TransactionStatement transaction;

    public HeaderStatement getHeader() {
        return header;
    }

    public void setHeader(HeaderStatement header) {
        this.header = header;
    }

    public BalanceOfStatement getBalance() {
        return balance;
    }

    public void setBalance(BalanceOfStatement balance) {
        this.balance = balance;
    }

    public TransactionStatement getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionStatement transaction) {
        this.transaction = transaction;
    }

    public FooterStatement getFooter() {
        return footer;
    }

    public void setFooter(FooterStatement footer) {
        this.footer = footer;
    }


}
