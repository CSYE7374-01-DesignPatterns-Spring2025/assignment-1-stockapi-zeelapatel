package edu.neu.csye7374;

public abstract class StockAPI implements Tradable{

	protected String id;
	protected double price;
	protected String desccription;
	
	
	public StockAPI(String id, double price, String desccription) {
		super();
		this.id = id;
		this.price = price;
		this.desccription = desccription;
	}

	@Override
	public String toString() {
		return "StockAPI [id=" + id + ", price=" + price + ", desccription=" + desccription + "]";
	}
	
}
