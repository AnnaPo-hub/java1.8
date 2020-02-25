public class CreditPaymentService {

    private double interestRate = 9.99;
    private double interestRatePerMonth = interestRate / 100 / 12;


    double annuitetPaymentCalculate(int loanAmount, int loanPeriodInYears) {
        int loanPeriodInMonth = loanPeriodInYears * 12;
        return loanAmount * (interestRatePerMonth + (interestRatePerMonth / (Math.pow(1 + interestRatePerMonth, loanPeriodInMonth) - 1)));

    }
}







