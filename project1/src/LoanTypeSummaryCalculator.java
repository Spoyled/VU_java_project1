import java.util.ArrayList;
import java.util.HashMap;

public class LoanTypeSummaryCalculator {
    private HashMap<Integer, LoanType> loanTypeMap; // HashMap containing loan types, with integer keys
    private ArrayList<IssueRepay> issueRepayList; // ArrayList containing issue/repay transactions

    public LoanTypeSummaryCalculator(HashMap<Integer, LoanType> loanType, ArrayList<IssueRepay> issueRepay) {
        this.loanTypeMap = loanType; // Initialize loanTypeMap with the given HashMap
        this.issueRepayList = issueRepay; // Initialize issueRepayList with the given ArrayList
    }

    public void calculateAndPrintSummarizedResults() {
        for (LoanType loanType : loanTypeMap.values()) { // Loop through each loan type in the loanTypeMap
            int loanTypeId = loanType.getId(); // Get the ID of the current loan type

            String loanTypeName = loanType.getName(); // Get the name of the current loan type
            double interestRate = loanType.getInterestRate(); // Get the interest rate of the current loan type

            double totalAmountIssued = 0; // Initialize totalAmountIssued to 0
            double totalAmountRepayed = 0; // Initialize totalAmountRepayed to 0
            double totalInterestAmount = 0; // Initialize totalInterestAmount to 0

            for (IssueRepay issueRepay : issueRepayList) { // Loop through each issue/repay transaction in issueRepayList
                if (issueRepay.getLoanId() == loanTypeId) { // Check if the current transaction corresponds to the current loan type
                    double amount = issueRepay.getAmount(); // Get the transaction amount
                    int inOut = issueRepay.getIn_out(); // Get the transaction type (-1 for issue, 1 for repay)

                    if (inOut == -1) { // If it's an issue transaction
                        totalAmountIssued += amount; // Add the transaction amount to totalAmountIssued
                        totalInterestAmount += amount * interestRate / 100; // Calculate and add the interest amount to totalInterestAmount
                    } else if (inOut == 1) { // If it's a repay transaction
                        totalAmountRepayed += amount; // Add the transaction amount to totalAmountRepayed
                    }
                }
            }

            // Print out the summarized results for the current loan type
            System.out.println("loanId=" + loanTypeId + ", loanName=" + loanTypeName +
                    ", amountIssuedOut=" + totalAmountIssued + ", amountRepayedIn=" + totalAmountRepayed +
                    ", interestAmount=" + totalInterestAmount);
        }
    }
}


