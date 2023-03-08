public class Stock {
    private  String stockName;
    private int noOfShares;
    private double sharePrice;

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", noOfShares=" + noOfShares +
                ", sharePrice=" + sharePrice +
                '}';
    }

    public Stock(){

    }
}