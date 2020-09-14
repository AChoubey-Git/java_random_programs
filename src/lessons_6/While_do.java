package lessons_6;

public class While_do {

	public static void main(String[] args) {
		

		int num=1;
		while(num<=50){
			
			if(isEvenNumber(num)) {
				System.out.println("Even number:"+ num);
		        }
			
			num++;	
					
	}
	}
	
	public static boolean isEvenNumber( int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
