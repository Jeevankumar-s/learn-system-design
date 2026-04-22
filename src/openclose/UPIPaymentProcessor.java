package openclose;

public class UPIPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("processing upi payment");
    }
}
