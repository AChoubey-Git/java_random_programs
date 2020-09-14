package java_basic_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		Scanner scn=null;
		try {
			scn = new Scanner(new BufferedReader(new FileReader("F:\\Web Development\\Java\\Run\\demo.txt"))) ;
			while(scn.hasNext()) {
				System.out.println(scn.next());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(scn!=null) {
				scn.close();
			}
		}
		
	}

}
