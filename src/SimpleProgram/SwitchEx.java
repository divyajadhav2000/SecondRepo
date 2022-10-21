package SimpleProgram;

public class SwitchEx {

	public static void main(String[] args) {
		String day="thursday";
		switch(day){
			
			case "sunday":
				System.out.println("this is sunday");
				break;
			case "monday":
				System.out.println("this is monday");
				break;
			case "tuesday":
				System.out.println("this is tueday");
				break;
			case "wednsday":
				System.out.println("this is wednsday");
				break;
			case "thursday":
				System.out.println("this is thursday");
				break;
			case "friday":
				System.out.println("this is friday");
				break;
			case "satday":
				System.out.println("this is satday");
				break;
			default:
				System.out.println("invalid choice");
		}
	}

}
