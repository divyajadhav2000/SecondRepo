package SimpleProgram;

public class switchex2 {

	public static void main(String[] args) {
		String s = "Multiplication";
		String operation =s.toLowerCase(); //converted into lower case
		
		switch(operation){
		case "addition":
			add(34,2);
			break;
		case "substraction":
			sub(23,7);
			break;
		case "multiplication":
			multi(43,7);
			break;
		case "division":
			div(34,2);
			break;
		default:
			System.out.println("invalid operation");
		}
	}
	
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println("addition is : "+c);
	}
	public static void sub(int a, int b) {
		int c=a-b;
		System.out.println("substraction is : "+c);
	}
	public static void multi(int a, int b) {
		int c=a*b;
		System.out.println("multiplication is : "+c);
	}
	public static void div(int a, int b) {
		int c=a/b;
		System.out.println("division is : "+c);
	}

}
