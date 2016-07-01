package hyundai;

import hyundai.Company;

public class CarTest {

	public static void main(String[] args) {
		
		Company hCompany = Company.getCompany();
		hCompany.addCar(new Sonata(3000, "Sonata"));
		hCompany.addCar(new Sonata(3000, "Sonata"));
		hCompany.addCar(new Sonata(3000, "Sonata"));
		hCompany.addCar(new Grandeur(4000, "Grandeur"));
		hCompany.addCar(new Grandeur(4000, "Grandeur"));
		hCompany.addCar(new Genesis(5000, "Genesis"));

		ReportPrice report = new ReportPrice();
		report.getPrice(); // 22000이 출력되는가?
	}
}
