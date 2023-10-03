package Simple;

public class Car extends Vechicle {

	public void drive() {
		System.out.println("repairing a car");
	}
	public static void main (String args[])
	{
		Car car=new Car();
		Vechicle vechicle =new Vechicle();
		car.drive();
		vechicle.drive();
	}
}
