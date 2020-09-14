package java_basic_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Character_Streams {

	public static void main(String[] args) throws IOException {
		
		FileReader fin=null;
		FileWriter fout=null;
		try {
			fin = new FileReader("F:\\Web Development\\Java\\Run\\demo.txt");
			fout = new FileWriter("F:\\Web Development\\Java\\Run\\output.txt");
			int c;
			while((c=fin.read())!=-1) {
				fout.write((char)c);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally{
			if(fin!=null) {
				fin.close();
			}
			if (fout!=null) {
				fout.close();
			}
		}
		
	}

}
