package SimpleProgram;

public class Function {

	public static void main(String[] args) {
	Function f = new Function();
	f.main1(34, 45);
	String s = f.getstudentname("divya");
	System.out.println("student name :"+s);
	int l =f.main3();
	System.out.println(l);
	}
	public  static void main1(int a , int b)
	{
		int x=a*b;
		System.out.println(x);
	}
	String getstudentname(String name)
	{
		return name;
	}
	public int main3()
	{
		int r = 34;
		return r;
	}
}
