import java.util.Scanner;

public class LoanDriver {

    public static void main(String[] args) {

        int loanCounter = 0;

        Loan[] loanArray = new Loan[3];

        System.out.println("""
            Welcome to Centennial Banking Loan Portal
            Here you can apply for and create loans\n""");


        while (loanCounter < loanArray.length) {
            Loan newLoan = createLoan();

            if (newLoan != null) {
                loanArray[loanCounter] = newLoan;
                loanCounter++;
            }

        }

        for (int i = 0; i < loanCounter ; i++ ) {

            System.out.println("****** Loan " + (i+1) + " Details ******");
            loanArray[i].printLoanDetails();
            loanArray[i].printAdminFee();
            System.out.println("\n");

        }

        }

        public static Loan createLoan() {

        Scanner input = new Scanner(System.in);
        String typeSelector;
        String applicantName;
        double loanAmount;
        int loanTerm;

        System.out.println("""
                    Select from one of the following Loan types:
                    1. Computer Loan
                    2. Accomodation Loan
                    3. Tuition Loan""");

        typeSelector = input.nextLine();

        System.out.println("Please enter your name: ");
        applicantName = input.nextLine();

        System.out.println("Please enter desired loan Amount: ");
        loanAmount = input.nextDouble();
        input.nextLine();

        System.out.println("Please enter desired loan term (years): ");
        loanTerm = input.nextInt();
        input.nextLine();

        switch (typeSelector) {
            case "1":
                if (validLoan(loanAmount, ComputerLoan.getMaxAmount(), loanTerm , ComputerLoan.getMinYear() , ComputerLoan.getMaxYear())) {
                    System.out.println("Computer Loan created.\n");
                    return new ComputerLoan(applicantName, loanTerm, loanAmount, LoanTypes.Computer);

                } else {
                    errorMessage(ComputerLoan.getMaxAmount(), ComputerLoan.getMinYear(), ComputerLoan.getMaxYear());
                    return null;
                }
            case "2" :
                if (validLoan(loanAmount, AccomodationLoan.getMaxAmount(), loanTerm , AccomodationLoan.getMinYear() , AccomodationLoan.getMaxYear())) {
                    System.out.println("Accomodation Loan created.\n");
                    return new AccomodationLoan(applicantName, loanTerm, loanAmount, LoanTypes.Accomodation);

                } else {
                    errorMessage(AccomodationLoan.getMaxAmount(), AccomodationLoan.getMinYear(), AccomodationLoan.getMaxYear());
                    return null;
                }
            case "3":
                if (validLoan(loanAmount, TuitionLoan.getMaxAmount(), loanTerm , TuitionLoan.getMinYear() , TuitionLoan.getMaxYear())) {
                    System.out.println("Tuition Loan created.\n");
                    return new TuitionLoan(applicantName, loanTerm, loanAmount, LoanTypes.Tuition);

                } else {
                    errorMessage(TuitionLoan.getMaxAmount(), TuitionLoan.getMinYear(), TuitionLoan.getMaxYear());
                    return null;
                }
            default:

                System.out.println("Error: Invalid loan type selected.");
                return null;
        }
    }
        public static boolean validLoan(double loanAmount, double maxLoan, int loanTerm, int minTerm, int maxTerm) {

            return (loanAmount <= maxLoan) && (loanTerm >= minTerm) && (loanTerm <= maxTerm);

        }

        public static void errorMessage(double maxLoan, int minTerm, int maxTerm) {
            System.out.println("Loan Rejected: Invalid inputs. Input must fall under below ranges:");
            System.out.println("Max loan Amount: " + maxLoan);
            System.out.println("Term duration between " + minTerm + " and " + maxTerm);
            System.out.println();

        }

    }

