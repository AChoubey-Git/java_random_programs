package java_string_var2;

public class WordCount {
	int count=0;
	
	int countword(String str) {
		
		int len=str.length();
		count=len;
		char[] orgstr=str.toCharArray();
		System.out.println(str);
		for(int i=1;i<len;i++) {
			for(int j=i;j<orgstr.length-i;j++) {
				orgstr[j]=orgstr[j+1];
				System.out.print(orgstr[j]);
				
			}
			for(int k=0,l=0;k<orgstr.length;k++,l++) {
				if(orgstr[i]==orgstr[l]){
					count++;
					
				}
				else {
					break;
				}
			}
		}
		System.out.println();
		
//		for(int j=1;j<=len;j++) {
//			int vcount=0;
//			for(int i=0;i<orgstr.length-j;i++) {
//				orgstr[i]=orgstr[i+1];
//				System.out.print(orgstr[i]);
//				
//				if(orgstr[i]==str.charAt(i)) {
//					count++;
//					vcount++;
//					
//				}
//				else if(orgstr[i]!=str.charAt(i)) {
//					
//					continue;
//					
//				}
//			}
//			System.out.print(" "+vcount);
//			System.out.println();
//		}

return count;
}
}
