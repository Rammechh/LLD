package DesignPatterns.StructuralDesignPattern.Adapter;
import lombok.Getter;

@Getter
public class PaymentRequest {

    private String name;
    private String phone;
    private String email;
    private int amount;
}
