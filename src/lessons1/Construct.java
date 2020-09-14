package lessons1;

public class Construct {
	int a,b,sum;

	public Construct(int x, int y) {
		
		a = x;
		b = y;
		sum=a+b;
		System.out.println("sum:"+ sum );
	}

	public Construct() {
		super();
		System.out.println("In default Constructor");
	}
	
	

}
