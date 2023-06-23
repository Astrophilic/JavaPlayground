package designpatterns.observerpattern.stockexample;

public interface StockObserver {
    void update(String ticker, Double price);
}
