package jrout.tutorial.corejava.classes;

public class Student {
	String name;
	int grade;
	int score;
	Address address;
	
	public Student(String theName , int theGrade){
		name = theName;
		grade = theGrade;
	}
	
/*	String address1;
	String address2;
	String address3;
*/	
	public void printMessage(){
		if(grade >= 4 && score > 55){
			System.out.println("Very well done "+name);
			address();
		}
	}
	
	public void address(){
		System.out.println(" Your prize will be shipped to "+ address.address1 +"\n"+ address.address2+" \n"+ address.address3);
	}
}
