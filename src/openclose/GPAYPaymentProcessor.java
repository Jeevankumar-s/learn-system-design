package openclose;

public class GPAYPaymentProcessor implements IPaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("processing GPAY payment");
    }
}
