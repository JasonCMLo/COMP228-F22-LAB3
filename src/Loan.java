public class Loan {


    private String borrowerName;
    private int loanTerm;
    protected double loanAmount;
    private double rateOfInterest;
    private LoanTypes loanType;

    public Loan(String borrowerName, int loanTerm, double loanAmount, double rateOfInterest, LoanTypes loanType) {
        this.borrowerName = borrowerName;
        this.loanTerm = loanTerm;
        this.loanAmount = loanAmount;
        this.rateOfInterest = rateOfInterest;
        this.loanType = loanType;
    }

    public double monthlyInstallment() {
        double installment;

        installment = (loanAmount + ((rateOfInterest / 100) * loanAmount)) / (loanTerm * 12);

        installment = (Math.floor(installment * 100) / 100);

        return installment;
    }

    public void printLoanDetails() {
        System.out.println("Borrower: " + borrowerName);
        System.out.println(("Loan Term (years): " + loanTerm)) ;
        System.out.println("Loan Amount ($): " + loanAmount);
        System.out.println("Interest Rate: " + rateOfInterest);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Monthly Payment Amount: $" + monthlyInstallment());
    }

    public void printAdminFee() {
    }
}
