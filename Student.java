import java.util.HashMap;

public class Student {
	   
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

 public Student (String firstName, String lastName, int registration, int grade, int year) {
	this.firstName = firstName.toUpperCase();
	this.lastName = lastName.toUpperCase();
	this.registration = registration;
	this.grade = grade;
	this.year = year;
}//constructor
	public Student (String firstName, String lastName) {
		this(firstName, lastName, 9876, 85, 3);
	}//constructor (sobrecarga)
	
public void printFullName(){
	System.out.println(firstName + " " + lastName);
}

 public void isApproved(){
    if( grade >= 60) 
    
 }

 public int changeYearIfApproved() {
    if (isApproved()) {
    	year = year + 1;
    	System.out.println("Congratulations");
    }
     return 0;
 }
 

}