public class CreditPayment {
    public static void main(String[] args) {
        CreditPaymentService CreditPaymentService = new CreditPaymentService();

        System.out.println("Сумма ежемесячного платежа составляет " + (int) CreditPaymentService.annuitetPaymentCalculate(1000000, 3));


    }
}
