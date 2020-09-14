package java_string;

public class WordCount {
 
	String inputstr;
	int count=0;
	
	public WordCount(String inputstr) {
		this.inputstr = inputstr;
	}
	int countword(String str) {
		int len=str.length();
		count=len;
		String orgstr=str;
		String tempstr;
		for(int i=0;i<len;i++) {
			
			tempstr=(String) str.subSequence(i+1,len);
			System.out.println(tempstr);
			
			for(int j=0;j<tempstr.length();j++) {
				if(orgstr.charAt(j)==tempstr.charAt(j)) {
					count++;
				}
				else if(orgstr.charAt(j)!=tempstr.charAt(j)) {
					break;
				}
			}
		}
		return count;
	}
}
