import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // read data from LoanType.json file and store it in a HashMap
        System.out.println("\n --- Read data from JSON ---");

        HashMap<Integer, LoanType> loanTypeMap = ReadDataFromJSON.readAllLoansToHashMap("C:/Users/spoyl/OneDrive/Stalinis kompiuteris/VU/1kursas/2semestras/data structures/projektas/project1/JSON_files/LoanType.json");

        // read data from IssueRepay.json file and store it in an ArrayList
        ArrayList<IssueRepay> issueRepayList = ReadDataFromJSON.readAllRepays("C:/Users/spoyl/OneDrive/Stalinis kompiuteris/VU/1kursas/2semestras/data structures/projektas/project1/JSON_files/IssueRepay.json");

        // create an instance of IssueRepayComparator and pass the LoanType HashMap to it
        IssueRepayComparator comparator = new IssueRepayComparator(loanTypeMap);

        // sort the issueRepayList using the IssueRepayComparator
        QuickSort.sort(issueRepayList, comparator);

        // print the sorted issueRepayList
        System.out.println("\n --- GIVE RESULTS ---");
        Util.printSortedIssueRepayList(issueRepayList, loanTypeMap);

        System.out.println();

        // create an instance of LoanTypeSummaryCalculator and pass the LoanType HashMap and IssueRepay ArrayList to it
        LoanTypeSummaryCalculator calculator = new LoanTypeSummaryCalculator(loanTypeMap, issueRepayList);
        calculator.calculateAndPrintSummarizedResults();
    }
}

