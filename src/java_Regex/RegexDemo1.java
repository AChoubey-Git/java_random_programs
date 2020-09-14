package java_Regex;

import java.util.regex.*;

public class RegexDemo1 {

	public static void main(String[] args) {
		int count=0;
		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("ababbabbaaabaab");
		
		while(matcher.find()) {
			count++;
			System.out.println("Starting index:"+matcher.start()+"..."+"Ending index:"+matcher.end()+"..."+"found character sequence: "+matcher.group());
			
		}
		System.out.println("Number of occurance in:"+count);

	}

}
