package SimpleProgram;

public class callbyValueCallbyRef {
	int pqr=1;
	public static void main(String[] args) {
		callbyValueCallbyRef obj = new callbyValueCallbyRef();
		obj.sum(43, 5);
	    obj.swap(obj);
	}
	
	public int sum(int a,int b) {
		int c = a+b;
		System.out.println("addition is "+c);
		return c;
	}
	
	public  void swap(callbyValueCallbyRef abc) {
		System.out.println("this is callby referance");
	   }

}
