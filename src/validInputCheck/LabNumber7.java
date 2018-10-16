package validInputCheck;

import java.util.Scanner;

public class LabNumber7 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		getRegexName1(key, "\\p{javaUpperCase}[a-zA-Z]{1,30}", "Please enter in a valid First name (First Letter needs to be capital):\n");
		
		getRegexName2(key, "\\p{javaUpperCase}[a-zA-Z]{1,30}", "Please enter in a valid Last name (First Letter needs to be capital):\n");
		
		getRegexEmail(key, "\\w{5,30}@\\w{5,10}.\\w{2,3}", "Please enter in a valid email address (example@hotmail.com):\n");
		
		getRegexPhoneNum(key, "[0-9]{3}-[0-9]{3}-[0-9]{4}", "Please enter in a valid phone number (xxx-xxx-xxxx):\n");
		
		getRegexDate(key, "^\\d{2}\\/\\d{2}\\/\\d{4}$", "Please enter in a valid date (dd/mm/yyyy):\n");
		
	}
	
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); 
		sc.nextLine(); 
		return s;
	}
	
	public static String getRegexName1(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid value for first name. Please enter in first name correctly!");
			} else {
				isValid = true;
				System.out.println("First Name is valid!");
				
			}

		}
		return null;

	}
	
	public static String getRegexName2(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid value for last name. Please enter in last name correctly!");
			} else {
				isValid = true;
				System.out.println("Last Name is valid!");
				
			}

		}
		return null;

	}
	
	public static String getRegexEmail(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid value for email. Please enter in email address correctly!");
			} else {
				isValid = true;
				System.out.println("Email is valid!");
				
			}

		}
		return null;

	}
	
	public static String getRegexPhoneNum(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid phone number. Please enter in phone number correctly!");
			} else {
				isValid = true;
				System.out.println("Phone number is valid!");
				
			}

		}
		return null;

	}
	
	public static String getRegexDate(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid date. Please enter in date correctly!");
			} else {
				isValid = true;
				System.out.println("Date is valid!");
				
			}

		}
		return null;

	}

}
