package com;

public class Student 
{
private String fName;
private String lName;
private String address;
private String gender;
private String course;
private String department;
public Student(String firstName, String lastName, String address, String gender, String course, String department) {
	super();
	this.fName = firstName;
	this.lName = lastName;
	this.address = address;
	this.gender = gender;
	this.course = course;
	this.department = department;
}
public String getFirstName() {
	return fName;
}
public void setFirstName(String firstName) {
	this.fName = firstName;
}
public String getLastName() {
	return lName;
}
public void setLastName(String lastName) {
	this.lName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
