package designpatterns.observerpattern.stockexample;

public class StockPriceObserver implements StockObserver {
    String ticker;
    Double threshold;

    public StockPriceObserver(String ticker, Double threshold) {
        this.ticker = ticker;
        this.threshold = threshold;
    }

    @Override
    public void update(String ticker, Double price) {
        if (ticker.equals(this.ticker) && price >= threshold) {
            System.out.printf("Notification stock price for ticker :%s is %f where threshold was : %f ", ticker, price, threshold);
            System.out.println();
        }
    }
}
