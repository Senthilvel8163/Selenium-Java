package Inheritance;

public class Bike extends Vehicle {
	
	public boolean hasDisk() {
		return true;
	}
	@Override
	public void applyBreake()  {
		super.applyBreake();
		System.out.println("Bike-->  breake applied ");
	}

}
