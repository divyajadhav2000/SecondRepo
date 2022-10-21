package SimpleProgram;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			int a =50/0;
		}
		catch(NullPointerException e){
			//e.printStackTrace();//this will show which type of exception occurred in program
			System.out.println("exception handled");
		}
		finally {
			System.out.println("i m executable");
			//connection close
		}
		
	}

}
