package jrout.tutorial.corejava.classes;

public class ReferenceExample {

	public static void main(String[] args) {
		
		Address rahulAddress = new Address();
		rahulAddress.address1 = "12 Hill Street";
		rahulAddress.address2 = "Room 21";
		rahulAddress.address3 = "33333";
		
		
		Address tusharAddress = rahulAddress;
		
		System.out.println(tusharAddress.address1);
		System.out.println(rahulAddress.address1);
		
		System.out.println(tusharAddress.address1.equals(rahulAddress.address1));
		
	}

}
