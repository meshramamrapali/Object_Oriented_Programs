import java.util.ArrayList;
import java.util.Scanner;

public class Stocks {
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
    double totalValue;
    int noOfStocks;
    Scanner scr = new Scanner(System.in);
    ArrayList<Stocks> list = new ArrayList<>();


    public Stocks() {
    }

  public  void stockPortfolio() {

        System.out.println("Enter no of stocks");
        noOfStocks = scr.nextInt();

        for (int i = 0; i <noOfStocks; i++) {
            Stocks stock = new Stocks();
            System.out.println("Enter stock name");
            stock.setStockName(scr.next());
            System.out.println("Enter number of shares");
            stock.setNoOfShares(scr.nextInt());
            System.out.println("Enter each share price");
            stock.setSharePrice( scr.nextDouble());
            list.add(stock);
            double stockValue = stock.getNoOfShares()*stock.getSharePrice();
            totalValue+=stockValue;
        }
    }
    void display(){
        for(Stocks stock : list){
            System.out.println(stock);
        }
    }
    private double balance;

    public Account(double initial_balance){

        if (initial_balance > 0.0)
            balance = initial_balance;
    }

    public void credit(double amount)
    {
        balance = balance + amount;
    }
    // debit the account

    public void debit(double debit_account){
        if (debit_account > balance){
            debit_account = 0.0;
            System.out.println("Debit amount exceeded account balance.");
        }
        balance = balance - debit_account;
    }
    public double getBalance() //return the account balance
    {
        return balance;
    }

    public static void main(String args[]) {
        Account account1 = new Account(50.00); // create Account object
        Account account2 = new Account(-7.53); // create Account object

    }
}