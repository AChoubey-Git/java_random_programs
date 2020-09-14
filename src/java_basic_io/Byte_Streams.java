package java_basic_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Streams {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		try {
			fin = new FileInputStream("‪C:\\Users\\LENOVO\\Desktop\\Dada\\demo.txt");
			fout = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Dada\\Amitav.txt");
			int c;
			//fin.skip(5); Skip 5 input value .
			while((c=fin.read())!=-1) {
			fout.write(c);
			}
			System.out.println(fin.available());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			if(fin!=null) {
				fin.close();
			}
			if(fout!=null) {
				fout.close();
			}
			
		}

	}

}
