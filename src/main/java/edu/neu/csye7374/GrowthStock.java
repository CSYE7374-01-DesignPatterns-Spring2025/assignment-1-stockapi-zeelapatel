package edu.neu.csye7374;

public class GrowthStock  extends StockAPI{

	private int metric;

	public GrowthStock(String id, double price, String desccription) {
		super(id, price, desccription);
		this.metric = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBid(String bid) {
		// TODO Auto-generated method stub
		double bidPrice = Double.parseDouble(bid);
		if (bidPrice < price) {
			metric += 10; 
		}else {
			metric -= 5;
		}
		price = bidPrice;
		
		
		
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return metric;
	}
	
	
	

}
