package java_Interfacedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player choubey = new Player("Amitav", 24, 70);
		System.out.println(choubey.toString());
		saveobj(choubey);
		choubey.setHitpoint(50);
		System.out.println(choubey);
		saveobj(choubey);
		loadobj(choubey);
		System.out.println(choubey);
	}

	public static ArrayList<String> readvalues(){
		ArrayList<String> values =new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean quit=false;
		int index=0;
		System.out.println("Chose\n "+"1 to enter a String\n"+ "0 to quit");
		while(!quit) {
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit=true;
				break;
			case 1:
				System.out.println("Enter a String :");
				String str =scanner.nextLine();
				values.add(index,str);
				index++;
				break;
			}
		}
		scanner.close();
		
		return values;
	}
	
	public static void saveobj(ISaveable objTosave) {
		for(int i=0;i<objTosave.write().size();i++) {
			System.out.println("Saving"+objTosave.write().get(i)+"to storage device");
		}
	}
	public static void loadobj(ISaveable objToread) {
		ArrayList<String> values = readvalues();
		objToread.read(values);
	}
}
		
