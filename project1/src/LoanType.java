/**
 * A class that represents a type of loan.
 */
public class LoanType {
    private int id;
    private String name;
    private double interestRate;

    /**
     * Constructs a new LoanType object with the given id, name, and interest rate.
     * @param id the id of the loan type
     * @param name the name of the loan type
     * @param interestRate the interest rate of the loan type
     */
    public LoanType(int id, String name, double interestRate) {
        this.id = id;
        this.name = name;
        this.interestRate = interestRate;
    }

    /**
     * Returns the id of the loan type.
     * @return the id of the loan type
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the loan type.
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the name of the loan type.
     * @return the name of the loan type
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the loan type.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the interest rate of the loan type.
     * @return the interest rate of the loan type
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the interest rate of the loan type.
     * @param interestRate the interest rate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Returns a string representation of the LoanType object.
     * @return a string representation of the LoanType object
     */
    public String toString() {
        return "LoanType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}

