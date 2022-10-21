package SimpleProgram;

public class SBIPuneBranch implements SBIHeadOffice{

	public static void main(String[] args) {
		SBIPuneBranch s = new SBIPuneBranch();
		s.homeloan();
		s.goldloan();
		
	}
	@Override
	public void homeloan() {
		System.out.println("this is homeloan");
		
	}

	@Override
	public void carloan() {
		System.out.println("this is carloan");
		
	}

	@Override
	public void goldloan() {
		System.out.println("this is goldloan");
		
		SBIHeadOffice.super.loan();	//this is how we call default method	
	}
	

}
