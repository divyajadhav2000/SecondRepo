package stringPrograms;

public class reverseString {

	public static void main(String[] args) {
		String abc ="banglore";
		for (int i= abc.length()-1; i >=0; i--)
		{
			System.out.print(abc.charAt(i));
		}
	}

}
