package java_string;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter String :");
		String inputstr=scanner.nextLine();
		
		WordCount wordcount = new WordCount(inputstr);
		
		System.out.println("String: "+inputstr+" & Count of similar word:"+wordcount.countword(inputstr));
		scanner.close();

	}

}
