package lessons_5;

public class SecAndMin {
	
	public static final String INVALID_VALUE_MESSEGE="Invalid value";

	public static void main(String[] args) {
		System.out.println(getDurationString(-65,45));
		System.out.println(getDurationString(3945));

	}
	public static String getDurationString(int min,int sec) {
		if((min<0)||((sec<0)||(sec>59))) {
			//System.out.println("Invalid value");
			return INVALID_VALUE_MESSEGE;
		}
		int hour = min/60;
		String hours=hour +"h";
		if (hour<10)
			hours = "0"+hour;
		int minute = min%60;
		String minutes = minute +"m";
		if (minute<10)
			minutes = "0"+minute;
		String second = sec +"s";
		if (sec<10)
			second = "0"+sec;
		return hours +" "+minutes +" "+second+"";
	}
	public static String getDurationString(int sec) {
		if(sec<0) {
			//System.out.println("Invalid value");
			return INVALID_VALUE_MESSEGE;
		}
		int minutes = sec/60;
		int seconds = sec%60;
		return getDurationString(minutes,seconds);
		
	}

}
