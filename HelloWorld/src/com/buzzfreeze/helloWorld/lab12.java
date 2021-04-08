package com.buzzfreeze.helloWorld;

public class lab12 {
	 public static void main(String[] args) {
		 String string1 = "You and Me";
		 String string2 = " you and me ";
		 
		 //lab7.1
		 if(string1.equals(string2))
		 System.out.println("Equal");
		 else
			 System.out.println("Not Equal");
		 
		 //lab7.2
		 String check = "You";
		 System.out.println(string1.contains(check));
		
		 //lab7.3
		 System.out.println("string1 length: " + string1.length());
		 System.out.println("string2 length: " + string2.length());
		 
		 //lab7.4
		 System.out.println(string1.substring(0,4));
		 System.out.println(string2.substring(0,4));
		 
		 //lab7.5
		 System.out.println(string1.trim());
		 System.out.println(string2.trim());
		 
		 //lab7.6
		 System.out.println(string1.toUpperCase());
		 System.out.println(string2.toUpperCase());
		 
		 //lab7.7
		 System.out.println(string2.toUpperCase().trim());
	 }
}
