package openclose;

public class ProblematicPaymentService {
    public void processPayment(PaymentType paymentType,double amount){
        if (paymentType == PaymentType.UPI) {
            System.out.println("processing upi payment");
        } else if(paymentType == PaymentType.GPAY){
            System.out.println("Processing GPAY payment");
        }
    }
}
