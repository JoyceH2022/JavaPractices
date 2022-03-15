package March15;

import java.util.Date;

class Student {
	String 	name;
	int 	age;
	Date    enrollmentDate;
	
	Student() {
		name = "";
		age  = 5;  // minimum student age
		enrollmentDate = new Date();
	}
	
	Student(String name, int age, Date enrollmentDate) {
		this.name = name;
		this.age  = age;  // minimum student age
		this.enrollmentDate = enrollmentDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
	public Date getEnrollmentDate() {
		return this.enrollmentDate;
	}
	
	public String toString() {
		return "name: " + this.name + " age: " + this.age + 
				" enrollment date: " + this.enrollmentDate;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Student s = (Student)obj;
		return ((this.name.equals(s.getName()) && 
				(this.age == s.getAge()) &&
				this.enrollmentDate == s.getEnrollmentDate()));
	}
}


public class March15Test{
	public static void main(String[] arg) {
		
		Date date = new Date();
		Student studentA = new Student("Joyce", 25, date);
		Student studentB = new Student("John", 30, date);
		
		System.out.println(studentA);
		System.out.println(studentB);
		
		if (studentA.equals(studentB)) {
			System.out.println("Student A equals Student B");
		} else {
			System.out.println("Student A not equals Student B");
		}
			
		
		
	}
}
