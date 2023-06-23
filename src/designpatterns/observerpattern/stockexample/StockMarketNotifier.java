package designpatterns.observerpattern.stockexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StockMarketNotifier implements StockMarket {

    private final Map<String, Set<StockObserver>> observerMap = new HashMap<>();

    private final Map<String, Double> prices = new HashMap<>();

    @Override
    public void addObserver(String ticker, StockObserver stockObserver) {
        if (observerMap.containsKey(ticker)) {
            observerMap.get(ticker).add(stockObserver);
        } else {
            HashSet<StockObserver> stockObservers = new HashSet<>();
            stockObservers.add(stockObserver);
            observerMap.put(ticker, stockObservers);
        }
    }

    @Override
    public void removeObserver(String ticker, StockObserver stockObserver) {
        if (observerMap.containsKey(ticker)) {
            observerMap.get(ticker).remove(stockObserver);
            if (observerMap.get(ticker).isEmpty()) {
                observerMap.remove(ticker);
            }
        }
    }

    @Override
    public void setPrice(String ticker, double price) {
        Double oldPrice = prices.get(ticker);
        if (oldPrice == null || oldPrice != price) {
            prices.put(ticker, price);
            notifyObservers(ticker, price);
        }
    }


    @Override
    public void notifyObservers(String ticker, double price) {
        if (observerMap.containsKey(ticker)) {
            for (StockObserver tickerObserver : observerMap.get(ticker)) {
                tickerObserver.update(ticker, price);
            }
        }

    }
}
