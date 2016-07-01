package hyundai;

public class Sonata extends Car {
	public String carName;
	
	public Sonata(int price, String carName){
		super(price);
		this.carName = carName;
	}
	
	public void getDetail(){
		System.out.println("this car is " + carName);
	}
}
