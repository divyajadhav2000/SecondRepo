package SimpleProgram;

public class TryCatchinLoop {

	public static void main(String[] args) {
		try 
		{
			try
			{
			int data[]	= new int[3];
			data[5] = 45;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			int value = 23/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("continue to next line of code");
	}
}

