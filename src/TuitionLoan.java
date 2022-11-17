public class TuitionLoan extends Loan {

    private static double maxAmount = 20000;
    private static double intRate = 2.5;
    private static int minYear = 3;
    private static int maxYear = 10;

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

        double adminFee = Math.floor(loanAmount * intRate) / 100;

        System.out.println("Admin Fee is calculated as [amount * rate / 100] = " + adminFee);
    }

    public TuitionLoan(String borrowerName, int loanTerm, double loanAmount, LoanTypes loanType) {
        super(borrowerName, loanTerm, loanAmount, intRate, loanType);
    }



}