package stringPrograms;

public class equalsMethod {
public static void main(String args[]) {
	String a="pune";  //these both a and b stored at same loc having diff loc id
	String b ="pune";
	
	String d = new String("pune");//object is stored at completly new location
	
	if(a==d) {   
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	if(a.equals(d)) {    //this method will check actual text of string
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	if(a==b) {           //here only check loc id if its same then true
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
