import java.util.Comparator;
import java.util.HashMap;

public class IssueRepayComparator implements Comparator<IssueRepay> {
    private HashMap<Integer, LoanType> loanTypes;

    public IssueRepayComparator(HashMap<Integer, LoanType> loanTypes) {
        this.loanTypes = loanTypes;
    }

    // Compare by two fields:
    // first by loanName, then by in_out
    @Override
    public int compare(IssueRepay ir1, IssueRepay ir2) {
        // Get the loan IDs from each IssueRepay object
        int loanId1 = ir1.getLoanId();
        int loanId2 = ir2.getLoanId();

        // Get the loan names corresponding to the loan IDs from the HashMap
        String loanName1 = loanTypes.get(loanId1).getName();
        String loanName2 = loanTypes.get(loanId2).getName();

        // Compare loan names first
        int loanNameCompare = loanName1.compareTo(loanName2);
        if (loanNameCompare != 0) {
            return loanNameCompare;
        }

        // If loan names are the same, compare in_out
        int inOut1 = ir1.getIn_out();
        int inOut2 = ir2.getIn_out();
        return inOut1 - inOut2;
    }
}

