public class AccomodationLoan extends Loan {

    private static double maxAmount = 6000;
    private static double intRate = 4.3;
    private static int minYear = 1;
    private static int maxYear = 4;

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
        System.out.println("There is a flat rate Admin fee of $65");
    }

    public AccomodationLoan(String borrowerName, int loanTerm, double loanAmount, LoanTypes loanType) {
        super(borrowerName, loanTerm, loanAmount, intRate, loanType);
    }



}