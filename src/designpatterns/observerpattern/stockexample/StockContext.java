package designpatterns.observerpattern.stockexample;


public class StockContext {

    public static void runStockObserverExample() {
        StockMarketNotifier stockMarketNotifier = new StockMarketNotifier();
        StockObserver stockObserver = new StockPriceObserver("AAPL", 200.0);
        StockObserver stockObserverCRM = new StockPriceObserver("CRM", 300.0);

        stockMarketNotifier.addObserver("AAPL", stockObserver);
        stockMarketNotifier.addObserver("CRM", stockObserverCRM);
        stockMarketNotifier.setPrice("AAPL", 250);
        stockMarketNotifier.setPrice("CRM", 320);
    }
}
