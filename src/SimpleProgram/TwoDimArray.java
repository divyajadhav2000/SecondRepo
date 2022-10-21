package SimpleProgram;

public class TwoDimArray {

	public static void main(String[] args) {
	 int a[][] = new int[3][2];
	 a[0][0] = 234;
	 a[0][1] = 34;
	 
	 a[1][0] = 74;
	 a[1][1] = 24;
	 
	 a[2][0] = 23;
	 a[2][1] = 345;
	 
	 for(int i=0; i<=2; i++)
	 {
		 for(int j =0; j<=1;j++) {
			 System.out.println(a[i][j]);
		 }
	 }
System.out.println(a.length); // this will display index length
	}

}
