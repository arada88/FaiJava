package com.buzzfreeze.helloWorld;

public class varexample {
	public static void main( String [] args) {
	bark();
	
	float newFloat = 4.5f;
	int newInt = ( int ) newFloat; 
	System.out.println("newFloat value: "+ newFloat);
	System.out.println("newInt value: "+ newInt);
	
	int myInt = 23;
	float myFloat = (float)myInt; 
	System.out.println("myInt value: "+ myInt);
	System.out.println("myFloat value: "+ myFloat);
	
	double myDouble = 0.4d;
	float newFloat2 = (float)myDouble;
	System.out.println("myDouble value: " + myDouble);
	System.out.println("newFloat2 value: " + newFloat2);
	
	char myChar = '\u0008';
	int newInt2 = (int)myChar;
	System.out.println("myChar value: " + myChar);
	System.out.println("newInt2 value: " + newInt2);
	
	//final String hello = "Hello"; 
	String hello = "Hello"; //remove "final" to run the program
	hello = "World";
	System.out.println("hello: " + hello);
	
	}

	public static void bark(){
    String dogName = "Booboo";
	System.out.println("The Dog name= "+ dogName);
	}
	
}
