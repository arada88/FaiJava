package com.buzzfreeze.ooplab;


public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for (int i = 0;i< employees.length; i++) {
			employees[i] = new Employee("First Name " + i,"Last Name " + i,10000* i,"Position " + i);
		}
	    System.out.println(employees[1].firstname);
	    System.out.println(employees[2].firstname);
	    System.out.println(employees[1].salary);
	    System.out.println(employees[0].position);
	}
	public static void test() {
		System.out.println("This is staticmethod");
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
	}

