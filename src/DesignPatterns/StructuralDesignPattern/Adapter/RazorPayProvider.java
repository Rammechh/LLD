package DesignPatterns.StructuralDesignPattern.Adapter;

import DesignPatterns.StructuralDesignPattern.External.RazorPayApi;
import DesignPatterns.StructuralDesignPattern.External.RazorPayStatus;

// Step 2 - Concrete adapters
public class RazorPayProvider implements PaymentProviderInterface {

    private RazorPayApi razorPayApi = new RazorPayApi();

    @Override
    public String generateLink() {
        return razorPayApi.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        razorPayApi.prePay();
        razorPayApi.pay(paymentRequest.getName(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPayApi.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {

        if (status == RazorPayStatus.PASS) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }


}
