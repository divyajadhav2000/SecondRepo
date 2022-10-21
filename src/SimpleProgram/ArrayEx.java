package SimpleProgram;

public class ArrayEx {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=23;
		a[1]=43;
		a[2]=263;
		a[3]=63;
		a[4]=23;
		
		for(int i = 0; i<=4 ; i++) {
			System.out.println(a[i]);
		}

		Object o[] = new Object[4];//we can store various variables of diff datatype in object class
		o[0]="sanket";
		o[1]=34;
		o[2]=56.87;
		o[3]=true;
		
		for(int j=0;j<=3;j++) {
			System.out.println(o[j]);
		}
	}

}
