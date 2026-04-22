package openclose;

public class PaymentService {
    public void process(IPaymentProcessor paymentProcessor, double amount){
        paymentProcessor.processPayment(amount);
    }
}
