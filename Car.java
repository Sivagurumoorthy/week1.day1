package week1.day1;

public class Car {
public void drivecar()
{
		System.out.println("i am driving acar");
}
	private void applyBrake()
{
	System.out.println("apply brake");

}	
public static void main(String[] args) {
		Car myCar = new Car ();
		myCar.drivecar();
		myCar.applyBrake();
	}
}

