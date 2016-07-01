package hyundai;

public class Grandeur extends Car {
	public String carName;
	
	public Grandeur(int price, String carName){
		super(price);
		this.carName = carName;
	}
	
	public void getDetail(){
		System.out.println("this car is " + carName);
	}
}
