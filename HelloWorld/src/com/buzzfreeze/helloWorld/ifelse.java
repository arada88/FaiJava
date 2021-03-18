package com.buzzfreeze.helloWorld;

public class ifelse {
	public static void main(String[] args) {
		int score = 75;
		boolean isHandsome = false;
		if (isHandsome == false) {
			if (score < 50) {
				System.out.println("fail");
			} else if (score >= 50 && score < 80) {
				System.out.println("normal");
			} else {
				System.out.println("Good");
			}		
		} else {
			System.out.println("Good");
		}
		
	}
}
