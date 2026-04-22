package openclose;

public class Main {
    public static void main(String[] args) {
//        ProblematicPaymentService paymentService = new ProblematicPaymentService();
//        paymentService.processPayment(PaymentType.UPI, 200);
        IPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        IPaymentProcessor gpayPaymentProcessor = new GPAYPaymentProcessor();
        IPaymentProcessor upiPaymentProcessor = new UPIPaymentProcessor();

        PaymentService paymentService = new PaymentService();
        paymentService.process(creditCardPaymentProcessor, 300);
        paymentService.process(upiPaymentProcessor, 400);
        paymentService.process(gpayPaymentProcessor, 500);
    }
}
