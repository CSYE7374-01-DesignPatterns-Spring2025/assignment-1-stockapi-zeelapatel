package edu.neu.csye7374;

import java.util.function.DoublePredicate;

public class ValueStock extends StockAPI {

	private int metric;

	public ValueStock(String id, double price, String description) {
		super(id, price, description);
		this.metric = 100;
	}

	@Override
	public void setBid(String bid) {
		// TODO Auto-generated method stub
		double bidPrice = Double.parseDouble(bid);
		if (bidPrice < price) {
			metric += 15;

		} else {
			metric -= 10;

		}
		price = bidPrice;

	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return metric;
	}

}
