package designpatterns.strategy.paymentexample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private int cost;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentContext(int cost) {
        this.cost = cost;
        this.paymentStrategy= new CreditCard("default","12312312");
    }

    public void pay(){
        paymentStrategy.pay(cost);
    }
}
