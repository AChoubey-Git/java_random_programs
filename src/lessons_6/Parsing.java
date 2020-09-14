package lessons_6;

import java.util.Calendar;
import java.math.*;

public class Parsing {

	public static void main(String[] args) {
		String numberString="2020";
		System.out.println("Number of String "+numberString);// .....2020.....String
		
		int number=Integer.parseInt(numberString);
		System.out.println("Number:"+number);//.......2020......Integer
		
		numberString+=1;
		number+=1;
		
		System.out.println("Number of String "+numberString);//.......20201.....
		System.out.println("Number:"+number);//.......2021........
		
		
		Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

	      System.out.format("%tD%n", c); 
	      
	}

}
