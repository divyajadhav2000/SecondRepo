package SimpleProgram;

public class LocalGlobalVar {
	int  a=23; 
	static int b =34;
	String name = "divya";
	
public static void main(String args[]) {
	double d= 56.6;
	
	System.out.println(d);
	
	LocalGlobalVar var = new LocalGlobalVar();
	System.out.println(var.a);
	System.out.println(var.name);
	
	System.out.println(b); //because we appliied static keyword to var b
							//thats why we can call that var without creating obj of class
}
}
