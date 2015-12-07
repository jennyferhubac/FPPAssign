package lesson8.question2;

import java.text.NumberFormat;
import java.util.ArrayList;

public class MarketingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marketing> mList = new ArrayList<Marketing>();
		mList.add(new Marketing("Jamie", "Brand C", 2400.00));
		
		fillMarketingList(mList);
		
		Marketing m = mList.get(2);
		
		System.out.println("Employee: " + m.employeeName + " Product Name: " + m.productName + " Sales Amount: " + m.salesAmount);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		double totSale = 0.0;
		for(Marketing market : mList)
		{
			if(market.productName.equalsIgnoreCase("Brand C"))
				totSale = totSale + market.salesAmount;
		}
		
		System.out.println("Total sales amount of Brand C is: " + currency.format(totSale));
		
	}
	
	public static void fillMarketingList(ArrayList<Marketing> mList)
	{
		mList.add(new Marketing("Billy", "Brand X", 3200.00));
		mList.add(new Marketing("David", "Brand C", 4300.00));
		mList.add(new Marketing("Julie", "Brand B", 3250.00));
		mList.add(new Marketing("Andie", "Brand C", 6600.00));
		mList.add(new Marketing("Mike", "Brand W", 5430.00));
	}

}
