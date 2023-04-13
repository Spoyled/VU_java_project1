import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Util {
    // sort and print a list of IssueRepay objects using a custom comparator
    public static void printSortedIssueRepayList(List<IssueRepay> issueRepayList, HashMap<Integer, LoanType> loanTypes) {
        // create a comparator that uses the given loanTypes map to compare IssueRepay objects
        IssueRepayComparator comparator = new IssueRepayComparator(loanTypes);
        // use the QuickSort class to sort the list using the custom comparator
        QuickSort<IssueRepay> srt = new QuickSort();
        srt.sort(issueRepayList, comparator);

        // print each sorted IssueRepay object, including the corresponding loan name from loanTypes
        for (IssueRepay issueRepay : issueRepayList) {
            String loanName = loanTypes.get(issueRepay.getLoanId()).getName();
            System.out.println("Date=" + issueRepay.getDate() + " LoanId=" +
                    issueRepay.getLoanId() + " LoanName=" + loanName + " Amount=" +
                    issueRepay.getAmount() + " In_Out=" + issueRepay.getIn_out());
        }
    }
}
