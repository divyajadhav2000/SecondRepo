package stringPrograms;

public class TestString {

	public static void main(String[] args) {
		String s="pune";
		String s1= "velocity";
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		
		final String s4="pune";
		String s5=s1+"pune";
		System.out.println(s5);
		
		String s6=s1.concat(s4);
		
		String s7="velocitypune";
		
		System.out.println(s6);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s4==s6);		
		System.out.println(s5==s6);
		
		System.out.println(s5==s7);



	}

}
