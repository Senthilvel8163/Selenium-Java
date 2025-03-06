 package Interface;

public interface RBI {
	 int UPIlimit = 100000;
	
	void aadharMandatory();
	
    void getAtmCard(boolean a);
	
	boolean panMandatory();
	
	//Use default and static keyword to use function in interface;
	
	default void housingLoan() {
		System.out.println("Home loan provided");
	}
	
	static void bikeLoan() {
		System.out.println("bike loan provided");
	}
	
	

}
