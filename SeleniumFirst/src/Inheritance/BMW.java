package Inheritance;

public class BMW extends Bike {

	int mileage = 20;

	String getColor() {
		return "red";
	}

	public static void main(String[] args) {

		BMW myBike = new BMW();
		myBike.getColor();
		int mileage2 = myBike.mileage;
		System.out.println(mileage2);
		boolean hasDisc = myBike.hasDisk();
		myBike.applyBreake();
		Vehicle myVeh = new Vehicle();
		myVeh.applyBreake();

	}

}