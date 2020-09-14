package java_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {

	private ArrayList<Integer> listofInt = new ArrayList<Integer>();
	public void addnumber(int num) {
		listofInt.add(num);
	}
	public ArrayList<Integer> getListofInt() {
		return listofInt;
	}
	public ArrayList<Integer> sortlist() {
		Collections.sort(listofInt);
		return listofInt;
	}

	public void printlist() {
		for(int i=0;i<listofInt.size();i++) {
			System.out.print(listofInt.get(i)+" ");
		}
		System.out.println("\r");
	}

	
}
