package stringPrograms;

public class countCharacters {

	public static void main(String[] args) {
		String inputstring="coderolls";
		char ch ='o';
		int count = 0;
		for(int i =0;i<inputstring.length();i++) {
			if(inputstring.charAt(i)== ch) {
				count++;
			}
		}
		System.out.println("o found "+count+ " times");
		System.out.println(inputstring.length());
		System.out.println(inputstring.charAt(2));
		System.out.println(inputstring.charAt(3));
		System.out.println(inputstring.charAt(4));
		
	}
	

}

//String p= price.substring(1, 5);
//to remove characters from string 