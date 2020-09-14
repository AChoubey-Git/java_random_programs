package lessons_6;

public class For_Loop {

	public static void main(String[] args) {
		

		for(int i=2;i<=8;i++) {
			System.out.println("10,000 Amount with InterestRate "+i+"% is equal to: "+String.format("%.2f", calculateInterest(10000.0,i)));
		}
		for(int i=8;i>=2;i--) {
			System.out.println("10,000 Amount with InterestRate "+i+"% is equal to: "+String.format("%.2f", calculateInterest(10000.0,i)));
		}
	}
	public static double calculateInterest(double amount,double interestRate) {
		return (amount *(interestRate/100));
	}

}
