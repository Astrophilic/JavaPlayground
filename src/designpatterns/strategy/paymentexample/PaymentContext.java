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

    public static void runExample(){
        PaymentContext paymentContext = new PaymentContext(100);
        paymentContext.setPaymentStrategy(new CreditCard("pankaj","12345"));
        paymentContext.pay();
        paymentContext.setPaymentStrategy(new Paypal("paypalPankaj","pnkj@gmail.com"));
        paymentContext.pay();

    }
}
