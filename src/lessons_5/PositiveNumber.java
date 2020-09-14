package lessons_5;

public class PositiveNumber {

	public static void main(String[] args) {
		
         checkNumber(5);
	}

	
	public static void checkNumber(int number) {
		
		if(number>0)
		{
			System.out.println("Positive number:"+ number);
		}
		else if (number<0)
		{
			System.out.println("Negitive number:"+ number);
		}
		else
		{
			System.out.println("Number:"+ number);
		}
	}
}
