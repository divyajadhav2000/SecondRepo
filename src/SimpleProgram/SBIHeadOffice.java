package SimpleProgram;

public interface SBIHeadOffice {
	public void homeloan();
	public void carloan();
	public void goldloan();
	
	public default void loan() {
		System.out.println("by default method loan");
	}
}
