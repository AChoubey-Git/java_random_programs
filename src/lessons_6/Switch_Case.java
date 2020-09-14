package lessons_6;
public class Switch_Case {

	public static void main(String[] args) {
	   
	   printDayOfTheWeek(0);
       printDayOfTheWeek(1);
       printDayOfTheWeek(2);
       printDayOfTheWeek(3);
       printDayOfTheWeek(4);
       printDayOfTheWeek(5);
       printDayOfTheWeek(6);
       printDayOfTheWeek(-1);
		char key= 'E';
		switch(key) {
		
		case 'A':
			System.out.println("character "+key);
			break;
		case 'B':
			System.out.println("character "+key);	
			break;
		case 'C':case 'D':case 'E':
			System.out.println("character "+key);
			break;
		default:
			System.out.println("Invalid character ");
			break;
			
		}
	}
	public static void printDayOfTheWeek(int day) {
		
		switch(day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednessday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Number");
			break;
				
		}
	}

}
