/**
 * Reading and Writing in text file
 * Using fileinputstream and fileoutputstream
 * 
 */

package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputeStream {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("sample.txt");
		
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("File created:-"+f.getName()+f.getPath());
		}
		else {
			System.out.println("File already exist: -"+f.getName()+f.getParent()+f.getAbsolutePath());
		}
		
		// writing into a file
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write("Hello pavan kumar bairu".getBytes());
			fos.flush();
			fos.close();
			
		// Reading from a file
			
			FileInputStream fis = new FileInputStream(f);
			
			int i =fis.read();
			
//			System.out.println(fis.read());  // Returns ASCII table numbers 
			
			// iteration will give you the data from a text file
			
			while (!(i==-1)) {
				
				char c = (char)i;
				
				i =fis.read();
				
				System.out.print(c);
				
				
			}
					
	}
	
	
}
