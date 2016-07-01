package hyundai;

public class Genesis extends Car {
	public String carName;
	
	public Genesis(int price, String carName){
		super(price);
		this.carName = carName;
	}
	
	public void getDetail(){
		System.out.println("this car is " + carName);
	}
}
