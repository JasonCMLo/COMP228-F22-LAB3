public class ComputerLoan extends Loan {

    private static double maxAmount = 1000;
    private static double intRate = 0;
    private static int minYear = 1;
    private static int maxYear = 2;

    public static double getMaxAmount() {
        return maxAmount;
    }

    public static int getMinYear() {
        return minYear;
    }

    public static int getMaxYear() {
        return maxYear;
    }
    public void printAdminFee() {
        System.out.println("There is no administration fee for Computer Loans");
    }

    public ComputerLoan(String borrowerName, int loanTerm, double loanAmount, LoanTypes loanType) {
        super(borrowerName, loanTerm, loanAmount, intRate, loanType);
    }



}