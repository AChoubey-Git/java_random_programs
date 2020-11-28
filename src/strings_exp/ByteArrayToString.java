
//17.	How to convert a byte array to String?
package strings_exp;

public class ByteArrayToString {

	public static void main(String[] args) {
		
		byte[] bytestr = {1,2,3,4,5}; 
		String toStr ="";
		for(int i=0;i<bytestr.length;i++) {
			toStr+=bytestr[i];
		}
		System.out.println("byte Array to String: "+toStr);

	}
}
