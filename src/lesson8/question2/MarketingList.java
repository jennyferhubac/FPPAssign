package lesson8.question2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketingList {
	
	static enum SortMethod {BYEMPLOYEE, BYSALES};
	private boolean ignoreCase = true;
	public void setIgnoreCase(boolean b) {
		ignoreCase = b;
	}
	public void sort(List<Marketing> market, SortMethod method) {
		Collections.sort(market, (e1,e2) ->
		{
			if(method == SortMethod.BYEMPLOYEE) {
				if(ignoreCase) return e1.employeeName.compareToIgnoreCase(e2.employeeName);
				else return e1.employeeName.compareTo(e2.employeeName);
			} else {
				if(e1.salesAmount == e2.salesAmount) return 0;
				else if(e1.salesAmount < e2.salesAmount) return -1;
				else return 1;
			}		
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marketing> mList = new ArrayList<Marketing>();
		mList.add(new Marketing("Jamie", "Brand C", 2400.00));
		
		fillMarketingList(mList);
		
		Marketing m = mList.get(2);
		
		System.out.println("Employee in index 2:");
		System.out.println("Employee: " + m.employeeName + " Product Name: " + m.productName + " Sales Amount: " + m.salesAmount);
		
		System.out.println("List of employees: ");
		System.out.println(mList);
		System.out.println("Size of the list: " + mList.size());
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		double totSale = 0.0;
		for(Marketing market : mList)
		{
			if(market.productName.equalsIgnoreCase("Brand C"))
				totSale = totSale + market.salesAmount;
		}
		
		System.out.println("Total sales amount of Brand C is: " + currency.format(totSale));
		
		mList.remove(1);
		
		System.out.println("List of employees after removing index 1.");
		
		mList.set(0, new Marketing("Regan", "Brand Y", 4550.00));
		
		MarketingList marList = new MarketingList();
		marList.sort(mList, SortMethod.BYEMPLOYEE);
		
		System.out.println(mList);
		
		marList.sort(mList, SortMethod.BYSALES);
		System.out.println(mList);
		
		System.out.println("Size of the list: " + mList.size());
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
