package ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LoggingIn {

	public static HashMap<String, String> logging = new HashMap<String, String>();	
	public static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args)  {
		loggingIn();
	}
	public static void loggingIn() {
	System.out.println("Howdy! Are you a new user? Type YES or NO");
	String answer = scan.next();
	switch (answer.toUpperCase()) {
	case "YES": 
		System.out.println("Are you an employee? Type YES or NO");
		String answer2 = scan.next();
		switch (answer2.toUpperCase()) {
		case "NO":
			System.out.println("Please enter your new Username: ");
			String newUsername = scan.next();
	        System.out.println("Please enter your new Password: ");
	     	String newPassword = scan.next();
	     	logging.put(newUsername, newPassword);
//	        usersList();
	        break;
		case "YES":
			System.out.println("Please enter your new Username: ");
			String newEmployeeUsername = scan.next();
	        System.out.println("Please enter your new Password: ");
	     	String newEmployeePassword = scan.next();
	        logging.put(newEmployeeUsername+"_workerbee", newEmployeePassword);
//	        usersList();
	        break;
		default: 
			System.out.println("Incorrect response, please retype answer");
		} break;
	case "NO": 
		System.out.println("Welcome back!");
		System.out.println("Please enter your Username and Password");
		String existingUsername = scan.next();
		if (logging.containsValue(existingUsername)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login unsuccessful, please try again");	
		}
		break;
	default: 
		System.out.println("Incorrect response, please retype answer");
	}
	}

//	public static void usersList() {
//		 Iterator<Entry<String, String>> it = logging.entrySet().iterator();
//			System.out.println("USERS LIST "+"("+(logging.size())+")"+":");
//			   while (it.hasNext()) {
//				   Map.Entry<String, String> map = it.next();
//			        System.out.println("Username: " + map.getKey() + "   " + " Password: " + map.getValue());
//		
//	}
//	}
}

	
	
			

	

