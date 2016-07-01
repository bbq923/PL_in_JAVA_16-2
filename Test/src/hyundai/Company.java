package hyundai;

import java.util.ArrayList;

public class Company {
	private static Company company = new Company();
	private static ArrayList<Car> carList = new ArrayList<Car>();
	
	private Company(){
		System.out.println("Company Singleton 생성");
	}
	
	public static Company getCompany(){
		if(company == null)
			company = new Company();
			
		return company;
	}
	
	public void addCar(Car c){
		carList.add(c);
	}
	
	// 참조하고 싶은 ArrayList index값을 받아 해당 위치의 Car 인스턴스를 리턴해 주는 메서드
	public Car getCar(int index){
		return carList.get(index);
	}
	
	// carList의 길이를 리턴해 주는 메서드
	public int getArrayListLength(){
		return carList.size();
	}
}
