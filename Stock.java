
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public String getName() {
		return name;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double changePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
	public String toString() {
		return String.format("The Stocks's Name is %s\nSysmbol: %s\nPrevious Closing Price: %.2f\nCurrent Price: %.2f\nThe Percentage Changed is: %.2f", 
				name, symbol, previousClosingPrice, currentPrice, changePercent()) +"%";

	}
	
	public static void main(String[] args) {
		Stock s1 = new Stock("GOOG", "Google Inc.");
		s1.setPreviousClosingPrice(100);
		s1.setCurrentPrice(90);
		System.out.println(s1 + "\n");
		
		Stock s2 = new Stock("FB", "Faceboob Inc");
		s2.setPreviousClosingPrice(351.89);
		s2.setCurrentPrice(348.99);
		System.out.println(s2 + "\n");
		
		Stock s3 = new Stock("AMZN", "Amazon Inc");
		s3.setPreviousClosingPrice(3448.14);
		s3.setCurrentPrice(3457.41);
		System.out.println(s3 + "\n");
	}
	
	
	
	
}
