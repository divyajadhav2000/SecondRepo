package SimpleProgram;

public class WraperClass {

	public static void main(String[] args) {
		String a = "100";
	
		
		int num= Integer.parseInt(a);
		System.out.println(num);
		
		double d = Double.parseDouble(a);
		System.out.println(d);
		
		int b = 56;
		String s =String.valueOf(b);
		System.out.println(s);
		
		double  c=34.5;
		int num1= (int) c;   //type casting
		System.out.println(num1);
	}

}
