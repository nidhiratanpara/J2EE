package zeeshan;

public class Parent {

	public static void main(String[] args) {
String s=new String();
s=null;
System.gc();
System.out.println("end of main");
}
	public void finalize(){
		System.out.println("finalize method called");
	}
}
