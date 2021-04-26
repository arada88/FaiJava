package com.buzzfreeze.helloWorld;

public class EmployeeSpecial extends Employee {
	public String firstname;
    public String lastname;
    private int salary;
    
    public Employee () {
    	this.firstname = "Anonymous";
    	this.lastname = "Anonymous";
    	this.salary = 9000;
    }
    public Employee (String firstnameInput,String lastnameInput) {
    	this();
    	this.firstname = firstnameInput;
    	this.lastname = lastnameInput;
    }
    		
    public Employee(String firstnameInput,String lastnameInput, int salaryInput) {
    	this.firstname = firstnameInput;
    	this.lastname = lastnameInput;
    	this.salary = salaryInput;
    }
    public void hello() {
    	System.out.println("Hello" + this.firstname);
    }
    public int getSalary() {
    	return salary;
    }

}
