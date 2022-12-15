package files;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {

		
//		  File f = new File(" path"); 
	/*	  File f = new File("D:\\Software & Work\\Java\\file.txt");
		  f.createNewFile(); 
		  System.out.println("Is file created : - "+f.createNewFile()); 
		  if(f.exists()) 
		  { 
			  f.delete(); 
			  System.out.println("File exists at: -"+f.getPath());
			  
		  }
		  System.out.println("Is file deleted :"+ f.canExecute());
		  System.out.println(f.exists());
	*/	 

		File f = new File("D:\\Software & Work\\Java\\file2.txt");
//		f.createNewFile();
		System.out.println("Is the file created :" +f.createNewFile());
//		System.out.println("Files already exists at : - "+f);
		System.out.println("Can we read the file :" +f.canRead());
//		System.out.println("Can we write the file " +f.canWrite());
//		System.out.println("File path : "+f.getAbsolutePath());
//		System.out.println(f.getAbsoluteFile());
//		System.out.println("File name is :-"+f.getName());
//		System.out.println("Parent name : -"+f.getParent());
//		System.out.println(""+f.lastModified());
//		System.out.println(""+f.length());
//		System.out.println(""+f.isHidden());
//		System.out.println(""+f.isDirectory());
		

		/*	
		File f = new File("./Resources/java/");
			  
		System.out.println(f.mkdir()); // to make folder, folders f.delete();
		System.out.println(f.delete());
		*/	 
	}

}
