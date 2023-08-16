package namakal1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileDemo fd=new FileDemo();
		//fd.learn_file();
		//fd.find_file();
	//	fd.foreach();
		fd.leaenfile();
		
		
	}
	private void leaenfile() {
	
				try {
				  File ff = new File("//home//varadhan//Desktop//Jailer.txt");
			        
					FileReader reader = new FileReader(ff);
			        
			        int r;
			        int count=0;
			        while((r=reader.read())!= -1) {
			            System.out.print((char)r);
			            count++;
			        }
			        
			        reader.close();
			        System.out.println(count);
			    } catch (FileNotFoundException e) {
			        e.printStackTrace();
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}
	private void foreach() {
		File ff = new File("//home//varadhan//Desktop");
		 String[] st  =    ff.list();
		 for(int i=0; i<st.length;i++)
		 {
		  System.out.println(st[i]);
		}
		 //for each String abcd in String array st
		/*
		 * for(String abcd:st) { System.out.println(abcd); }
		 */
	}
	private void find_file() {
		File ff = new File("//home//varadhan//Desktop");
		File[] files_folders = ff.listFiles();
		for(int i=0; i<files_folders.length;i++)
		{
		  File file_folder = files_folders[i];
		  if(file_folder.isDirectory())
		  {
		  System.out.println(file_folder);  
		  }
		}
		
	}
	private void learn_file() {
	    // TODO Auto-generated method stub
	
				File ff = new File("//home//varadhan//Desktop//Jailer.txt");
				try {
					  FileWriter writer = new FileWriter(ff,true);
					 
					  BufferedWriter bufWriter = new BufferedWriter(writer);
					  bufWriter.append("Suriya");
					  bufWriter.append("SK");
					  bufWriter.newLine();
					  bufWriter.append("Vikram");
					  bufWriter.append("VS");
					    
					  bufWriter.flush();
					  bufWriter.close();
					 
					} catch (IOException e) {
					  // TODO Auto-generated catch block
					  e.printStackTrace();
					}
				
				
				//System.out.println(ff.delete());
				//System.out.println(ff.exists());
				//ff.mkdir();
			//	ff.mkdirs();
}
}