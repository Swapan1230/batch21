package jrout.tutorial.corejava.classes;

public class School {

	public static void main(String[] args) {
		Student rahul = new Student("Rahul",4);
		
		System.out.println(rahul.name);
//		rahul.name = "Rahul";
		System.out.println(rahul.name.toUpperCase());
//		rahul.grade = 4;
		rahul.score = 90;
		
		Address rahulAddress = new Address();
		rahulAddress.address1 = "12 Hill Street";
		rahulAddress.address2 = "Room 21";
		rahulAddress.address3 = "33333";
		
		rahul.address = rahulAddress;
		rahul.printMessage();
		
		// if he is more than 4th grade and score is more than 55 then say very well done Rahul.

		/*if(rahul.grade > 4 && rahul.score > 55){
			System.out.println("Very well done Rahul");
		}*/
		
		/*Student tushar = new Student();
		tushar.name = "Tushar";
		tushar.grade = 5;
		tushar.score = 67;
		
		tushar.address1 = "12 Hill Street";
		tushar.address2 = "Room 21";
		tushar.address3 = "33333";
		tushar.printMessage();*/
		
		// if he is more than 4th grade and score is more than 55 then say very well done Rahul.
		/*
		if(tushar.grade > 4 && tushar.score > 55){
			System.out.println("Very well done Tushar");
		}
		*/
	}

}
