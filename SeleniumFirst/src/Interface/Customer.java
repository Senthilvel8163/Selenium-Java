package Interface;

public class Customer {
	public static void main(String[] args) {
		
		HDFCChennai chennai = new HDFCChennai();
		chennai.aadharMandatory();
		chennai.getAtmCard(false);
		chennai.housingLoan();
		chennai.panMandatory();
	
		
		Axis myBank = new Axis();
		myBank.aadharMandatory();
		boolean panMandatory = myBank.panMandatory();
		System.out.println(panMandatory);
		myBank.interestFreeLoan();
		
		myBank.housingLoan();
		
		System.out.println(Axis.UPIlimit); 
		
		RBI myRbi = new Axis();
		myRbi.housingLoan();
		RBI.bikeLoan(); 
		
	}

}
