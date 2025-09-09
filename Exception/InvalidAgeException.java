package Exception;

//1.Create a program in Java that throws a custom exception called InvalidAgeException 
//if the user enters an age less than 18. Otherwise, print "Valid Age - You can Vote!".

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException() {
		super("invalid age to vote");
	}
}
class VoterAgeValidate{
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