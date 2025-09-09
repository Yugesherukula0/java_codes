package javalabs;

import Exception.InvalidAgeException;

public class Lab09092025 {
	public static void main(String[] args) {
		int age=17;
		try {
			if(age<18) {
				throw new InvalidAgeException();
			}
		} catch(InvalidAgeException e) {
			System.out.println("must cross 18 years of age");	
		}
	}
	
}
