package lessons_6;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Year_Of_birth:");
		
		boolean checkInt = scanner.hasNextInt();
		
		if(checkInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter your name: ");
			String name = scanner.nextLine();
			int age = 2020 - yearOfBirth;
			
			if ((age>=0)&& (age <=100)) {
				System.out.println(name +" Year Of Birth: "+yearOfBirth +",So your Age is : ="+age );
			}
			else {
				System.out.println("Invalid year of birth.");
			}
			
		}else {
			System.out.println("Unable to parse the year of birth.");
		}
		
		scanner.close();

	}

}
