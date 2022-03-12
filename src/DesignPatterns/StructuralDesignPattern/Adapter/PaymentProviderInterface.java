package DesignPatterns.StructuralDesignPattern.Adapter;

// Step 1 - Create common adapter interface
public interface PaymentProviderInterface {

    public String generateLink();

    public void pay(PaymentRequest paymentRequest);

    public PaymentStatus checkStatus();
}