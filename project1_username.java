import java.util.*
import java.io.*

public class Main{

	public static void main(String[] args) {

		String username;
		boolean rules;
		char letter;
		char number;
		char underscore;
		Scanner scanner = new Scanner (System.in);


		System.out.println("Create a username following these simple rules: ");

		//Maybe I should do a table to show the rules (?)
		System.out.println("1- The username is between 4 and 25 characters.");
		System.out.println("2- It must start with a letter.");
		System.out.println("3- It can only contain letters, numbers, and the underscore character.");
		System.out.println("4- It cannot start with an underscore character.");

		System.out.println("Choose your username: ");
		username = scanner.next();

		if(letter == username.charAt(0) && isLowerCase == true){
			rules = true;
		} else{
			if(number == username.charAt(0) || underscore == username.charAt(0)){
				rules = false;
			}
		}
		
		
		

		if (rules == true){
			System.out.print("This username complies with the rules");
		} else{
			System.out.print("This username is not allowed");
		}	
		
	}
}

