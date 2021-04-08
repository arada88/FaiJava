package com.buzzfreeze.ooplab;


public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	public static void main(String[] args) {
		Employee em1 = new Employee("Krissada", "Chalermsook", 10000,"CEO");
		em1.checkPosition();
	}
	
	
	public Employee( String firstnameInput, String lastnameInput, int salaryInput,String positionInput ) {
	firstname = firstnameInput;
	lastname = lastnameInput;
	salary = salaryInput;
	position = positionInput;
	}
	public void hello() {
	System.out.println("Hello " + firstname);
	}
	public int getSalary() {
	return salary;
	}
	
	public void checkPosition() {
		System.out.println("My Position is " + position);
	}
	}

