package Interface;

public class Axis implements RBI {
	public void interestFreeLoan() {
		System.out.println("Free loan");
	}

	@Override
	public void aadharMandatory() {
		System.out.println("Aadhar added");
		
	}

	@Override
	public boolean panMandatory() {
		return true;
	}

	public void getAtmCard() {
		
		
	}

	@Override
	public void getAtmCard(boolean a) {
		// TODO Auto-generated method stub
		
	}

}
