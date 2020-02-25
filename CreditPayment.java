public class CreditPayment {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        System.out.println("Сумма ежемесячного платежа составляет " + (int) creditPaymentService.annuitetPaymentCalculate(1000000, 3));


    }
}
