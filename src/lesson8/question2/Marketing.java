package lesson8.question2;

public class Marketing {
	String employeeName;
	String productName;
	double salesAmount;
	
	Marketing(String employeeName, String productName, double salesAmount)
	{
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("Employee Name: ");
		sb.append(employeeName);
		sb.append(" Product Name: ");
		sb.append(productName);
		sb.append(" Sales Amount: ");
		sb.append(salesAmount);
		sb.append(">");
		return sb.toString();
		
	}

}
