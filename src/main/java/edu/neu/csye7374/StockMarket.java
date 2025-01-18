package edu.neu.csye7374;

public class StockMarket {

	public static void demo() {
		StockAPI growthStock = new GrowthStock("IBM", 900, "IBM Growth stock");
		StockAPI valueStock = new ValueStock("Nvidea", 1210, "Nvidea Value stock");

		System.out.println("initial state");
		System.out.println(growthStock);
		System.out.println(valueStock);

		String[] growthBids = { "810", "820", "800", "830", "850", "840" };
		String[] valueBids = { "1250", "1208", "1300", "1270", "1220", "1200" };

		System.out.println("\n Growth Stock:");

		for (String bid : growthBids) {
			growthStock.setBid(bid);
			System.out.println("After Bid: $" + bid + ", Metric: " + growthStock.getMetric());
			System.out.println(growthStock);
		}
		System.out.println("\n Value Stock:");
		for (String bid : valueBids) {
			valueStock.setBid(bid);
			System.out.println("After Bid: $" + bid + ", Metric: " + valueStock.getMetric());
			System.out.println(valueStock);
		}

	}

}
