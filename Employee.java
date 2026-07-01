package PracticeProgram;

public class Employee {
	private int age;
	
	public void setAge(int age) {
		if(age >=18 && age <= 65) {
			this.age= age;
		} else {
			System.out.print("Invalid Age ");
		}
	}
	public int getAge() {
		if(age == 0) 
			System.out.print("Wrong Age :");
		return age;
	}
}
