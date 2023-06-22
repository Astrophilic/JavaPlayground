package designpatterns.strategy.paymentexample;

public class CreditCard implements PaymentStrategy{

    private final String customerName;
    private final String cardDetails;

    public CreditCard(String customerName, String cardDetails) {
        this.customerName = customerName;
        this.cardDetails = cardDetails;
    }

    @Override
    public void pay(int cost) {
        System.out.println("paid using credit card"+cost);
    }
}
