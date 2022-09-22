package projeto1_username;

import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {

		String username;
		boolean rules;
		boolean length;
		boolean startLetter;
		boolean haveNumber;
		boolean underscore;
		
		Scanner scanner = new Scanner (System.in);


		System.out.println("Create a username following these simple rules: ");

		//Maybe I should do a table to show the rules (?)
		System.out.println("1- The username is between 4 and 25 characters.");
		System.out.println("2- It must start with a letter.");
		System.out.println("3- It can only contain letters, numbers, and the underscore character.");
		System.out.println("4- It cannot finish with an underscore character.");

		System.out.println("Choose your username: ");
		username = scanner.next();

		if(username.length() < 4 || username.length() > 25){
			length = false;
		}else{
			length = true;
		}

		if(length == true){
            size = username.length();
            System.out.println("Username length: " + size);
        }

		if(username.substring(0).matches("[A-Z][a-z]*")){
			startLetter = true;
		}else{
			startLetter = false;
		}

		if(username.substring().find("0-9*")){
			haveNumber = true;
		} else{
			haveNumber = false;
		}

		if(username.substring().matches("_") && username.substring().lastIndexOf("_")){
			underscore = false;
		} else{
			underscore = true;
		}


		if (lenght == true && startLetter == true && haveNumber == true && underscore == true){
			System.out.print("This username complies with the rules");
		} else{
			System.out.print("This username is not allowed");
		}	
		
	}
}

