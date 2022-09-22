import java.util.*;
import java.io.*;

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

		if(username.length() < 4 || username.length() > 25){
			rules = false;
		}else{
			rules = true;
		}

		if(username.substring(0).matches("[A-Z]")){
			rules = true;
		}else{
			rules = false;
		}

		if(username.substring().matches("0-9*")){
			rules = true;
		} else{
			rules = false;
		}
		
		if (rules == true){
			System.out.print("This username complies with the rules");
		} else{
			System.out.print("This username is not allowed");
		}	
		
	}
}

