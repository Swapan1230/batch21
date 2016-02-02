package jrout.tutorial.corejava.arrays;

public class AccessMethod {
	
	public static void main(String[] args) {
		String message = printMe("Jayram");
		int sum = add(3,4);
		System.out.println(message + " your Sum is "+ sum);
	}
	
	/*public static void printMe(String name){
		System.out.println("Hello "+ name);
	}*/
	
	public static String printMe(String name){
		return ("Hello "+ name);
	}
	public static int add(int a, int b){
		return a + b;
	}
	
	// Hello Jayram your sum is 7
	
	
}
