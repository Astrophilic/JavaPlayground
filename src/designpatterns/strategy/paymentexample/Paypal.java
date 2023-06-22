package designpatterns.strategy.paymentexample;

public class Paypal implements PaymentStrategy{
    private String payPalUserName;
    private String email;

    public Paypal(String payPalUserName, String email) {
        this.payPalUserName = payPalUserName;
        this.email = email;
    }

    @Override
    public void pay(int cost) {
        System.out.println("paid using paypal"+cost);
    }
}
