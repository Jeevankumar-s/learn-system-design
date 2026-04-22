package openclose;

public class CreditCardPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("processing CreditCard payment");
    }
}
