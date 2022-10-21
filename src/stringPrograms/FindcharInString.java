
package stringPrograms;

import java.io.UnsupportedEncodingException;

public class FindcharInString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="testdemo";
		int index= str.indexOf('d');
		System.out.println("'d'is at index \n"+index);
		
		System.out.println(str.charAt(5));
		System.out.println(str.getBytes());

		}
}


