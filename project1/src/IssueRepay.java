public class IssueRepay {

    private String date;    // The date the loan was issued or repaid
    private int loanId;     // The ID of the loan
    private double amount;  // The amount issued or repaid
    private int in_out;     // The type of transaction (0 for issue, 1 for repay)

    // Constructor for IssueRepay class
    public IssueRepay(String date, int loanId, double amount, int in_out) {
        this.date = date;
        this.loanId = loanId;
        this.amount = amount;
        this.in_out = in_out;
    }

    // Getter and setter methods for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and setter methods for loanId
    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    // Getter and setter methods for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter and setter methods for in_out
    public int getIn_out() {
        return in_out;
    }

    public void setIn_out(int in_out) {
        this.in_out = in_out;
    }

    // Override toString() method to return a string representation of IssueRepay object
    @Override
    public String toString() {
        return "IssueRepay{" +
                "date='" + date + '\'' +
                ", loanId=" + loanId +
                ", amount=" + amount +
                ", in_out=" + in_out +
                '}';
    }
}

