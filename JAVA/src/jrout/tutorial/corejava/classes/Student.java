package jrout.tutorial.corejava.classes;

public class Student {
	private String name;
	private int grade;
	private int score;
	private int heigth;
	
	private Address address;
	
	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if(grade < 0){
			this.grade = 2;
		}else{
			this.grade = grade;	
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(String name , int grade){
		this.name = name;
		this.grade = grade;
	}

	public Student(String name , int grade, int score){
		this(name,grade);
		this.score = score;
		System.out.println("Created "+ name);
	}

/*	String address1;
	String address2;
	String address3;
*/	
	public void printMessage(){
		if(grade >= 4 && score > 55){
			System.out.println("Very well done "+name);
			//address();
		}
	}
	
	public void printMessage(String message){
		if(grade >= 4 && score > 55){
			System.out.println("Very well done "+name+" "+ message);
			//address();
		}
	}
	
	public void address(){
		System.out.println(" Your prize will be shipped to "+ address.address1 +"\n"+ address.address2+" \n"+ address.address3);
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Destroyed" + this.name);
	}
}
