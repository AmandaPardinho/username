package projeto1_username;

import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {

		String username;
		boolean length;
		boolean isALetter;
		boolean haveNumber;
		boolean haveAUnderscore;
		boolean isInTheEnd;
		int size = 0;
				
		Scanner scanner = new Scanner (System.in);

		System.out.println("Create a username following these simple rules: ");

		System.out.println("1- The username is between 4 and 25 characters.");
		System.out.println("2- It must start with a letter.");
		System.out.println("3- It can only contain letters, numbers, and the underscore character.");
		System.out.println("4- It cannot finish with an underscore character.");

		System.out.println("Choose your username: ");
		username = scanner.next();

		if(username.length() < 4 || username.length() > 25){
			//username length is not allowed because expression == true;
			length = false;
		}else{
			//username length is allowed because expression == false
			length = true;
		}

		if(length == true){
            size = username.length();
            System.out.println("Username length: " + size);
        }

		if(username.substring(0,1).matches("[a-zA-Z]")){
			isALetter = true;
		}else{
			isALetter = false;
		}

		if(isALetter == true && username.substring(1).matches(".*\\d+.*")){
			haveNumber = true;
		} else{
			haveNumber = false;
		}

		if(username.substring().contains("_")){
			haveAUnderscore = true;
		} else{
			haveAUnderscore = false;
		}

		if(username.substring().lastIndexOf("underscore")){
			//not allowed
			isInTheEnd = true;
		} else{
			//alowed
			isInTheEnd = false;
		}

		if (lenght == true && isALetter == true && haveNumber == true && haveAUnderscore == true && isInTheEnd == false){
			System.out.print("This username complies with the rules");
		} else{
			System.out.print("This username is not allowed");
		}	
		
	}
}

