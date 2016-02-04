package jrout.tutorial.corejava.classes;

public class OverloadingExample {

	public static void main(String[] args) {
		OverloadingExample ole = new OverloadingExample();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(ole.add(a,b,4,5,6,7,4));
		
//		System.out.println(ole.add(2,3,5));
	}
	
	public int add(int a , int b){
		a = 7 - b;
		b = 6 + a;
		return (a+b+10);
	}

	public int add(int a , int b, int c){
		int val = this.add(a, b);
		return(val+c);
	}
	
	public int add(int ...is){
		System.out.println(is.length);
		return 5;
	}
}


