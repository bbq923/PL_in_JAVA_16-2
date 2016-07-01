package hyundai;

public class ReportPrice {
	Company hCompany = Company.getCompany(); //singleton 객체 hCompany를 받는다.
	
	public void getPrice(){
		int priceSum = 0;
		
		for(int i = 0; i < hCompany.getArrayListLength() ; i++)
			priceSum += hCompany.getCar(i).getPrice();
		
		System.out.println("car price sum : " + priceSum);
	}
}
