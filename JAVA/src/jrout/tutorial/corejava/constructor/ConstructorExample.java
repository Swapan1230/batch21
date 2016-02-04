package jrout.tutorial.corejava.constructor;

import jrout.tutorial.corejava.classes.Student;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Student rahul = new Student("Rahul",5,67);
		rahul.printMessage("Job well done");
		
		rahul.printMessage();
		
		for(int i = 0 ; i < 50000 ; i++){
			new Student("Rahul"+i,5+i,67+i);
		}
		
//		rahul.printMessage();
		
		
		/*Student raj = new Student("Raj",4);
		System.out.println(raj.name);*/
		
	}

}
