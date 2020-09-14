package lessons_5;

/*
 * Overloading methods which is basically using the same method name but with different number of parameter.  
 */

public class Overloding {

	public static void main(String[] args) {
		
		//message("Hello Everyone",1);
		//message("Hello Everyone");
		//message("Hello Everyone",2,"I'm amitav choubey as your instructor");
	double result=calcFeetAndInchesToCentimeters(6,0);
	calcFeetAndInchesToCentimeters(100);
	System.out.println(result);
		
	}
	public static void message(String msg,int msgno) {
		System.out.println("Message No:"+ msgno + msg +" this is  the msg" );
		
	}
	public static void message(String msg) {
		System.out.println( msg +" this is  the msg" );
		
	}
	public static void message(String msg,int msgno,String msgdes) {
		System.out.println("Message No:"+ msgno + msg +" this is  the msg" +msgdes);
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		/*if((feet>=0) || ((inches>=0) && (inches<=12))) {
			double centimeter=(feet * inches)*2.54;
			centimeter+=inches*2.54;
			return centimeter;
		}*/
		
		if((feet<0)||((inches<0) || (inches>12))) {
			System.out.println("invalid feet or inches parameter");
			return -1;
		}
		double centimeter=(feet * 12)*2.54;
		centimeter+=inches*2.54;
		System.out.println(feet +"feet,"+inches +"inches= "+ centimeter+"cm");
		return centimeter;
			
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		double feet=(int)inches/12;
		double remaininches=(int)inches % 12;
		System.out.println(inches+ " is equal to "+feet + "feets And "+ remaininches +"inches");
		return calcFeetAndInchesToCentimeters(feet,remaininches);
		
	}

}

