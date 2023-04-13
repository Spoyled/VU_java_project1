import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadDataFromJSON {

    // This method reads data from a JSON file and stores it in an ArrayList of type IssueRepay
    public static ArrayList<IssueRepay> readAllRepays(String fileName) {
        ArrayList<IssueRepay> repays = new ArrayList(); // create an empty ArrayList of IssueRepay objects
        Gson gson = new Gson(); // create a Gson object for JSON parsing

        try (Reader reader = new FileReader(fileName)) {
            // parse the JSON file and store the data in the ArrayList of IssueRepay objects
            repays = gson.fromJson(reader, new TypeToken<ArrayList<IssueRepay>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return repays; // return the ArrayList of IssueRepay objects
    }

    // This method reads data from a JSON file and stores it in a HashMap of type Integer, LoanType
    public static HashMap<Integer, LoanType> readAllLoansToHashMap(String fileName) {
        HashMap<Integer, LoanType> loans = new HashMap(); // create an empty HashMap of Integer, LoanType objects
        Gson gson = new Gson(); // create a Gson object for JSON parsing

        try (Reader reader = new FileReader(fileName)) {
            // parse the JSON file and store the data in the HashMap of Integer, LoanType objects
            loans = gson.fromJson(reader, new TypeToken<HashMap<Integer,LoanType>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return loans; // return the HashMap of Integer, LoanType objects
    }
}

