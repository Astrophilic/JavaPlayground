package designpatterns.observerpattern.stockexample;

public interface StockMarket {

    void addObserver(String ticker, StockObserver stockObserver);


    void removeObserver(String ticker, StockObserver stockObserver);

    void setPrice(String symbol, double price);

    void notifyObservers(String ticker, double price);
}
