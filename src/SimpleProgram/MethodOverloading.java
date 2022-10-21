package SimpleProgram;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.method1(45, 56, 7);
		m.method1(4, 2);
		m.method1(45.0, 3.2);
	}
	public void method1(int a , int b) {
		int c = a*b;
		System.out.println(c);
	}
	public void method1(int a,int b , int c) {
		int d = a+b+c;
		System.out.println(d);
	}
	public  void method1(double a,double n) {
		double y = a-n;
		System.out.println(y);
	}

}
