package namakal1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileDemo1 fd=new FileDemo1();

//fd//.learn_file();
////fd.fileendswith();
//fd.file_folders();
fd.resume();
	}

	private void resume() {
		
		{
	        // Specify the file path
	        String filePath = " //home//varadhan//Desktop//varadhanresume.txt";
	        
	        // Specify the regular expression pattern
	        String regexPattern = "[0-9]";
	        		//+ "; // Example pattern for SSN
	        
	        try {
	            // Open and read the text file
	            FileReader fileReader = new FileReader(" //home//varadhan//Desktop//varadhanresume.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            String line;
	            Pattern pattern = Pattern.compile(regexPattern);
	            
	            // Process each line
	            while ((line = bufferedReader.readLine()) != null) {
	                Matcher matcher = pattern.matcher(line);
	                
	                // Find and process matches in the line
	                while (matcher.find()) {
	                    String match = matcher.group(); // Get the matched text
	                    System.out.println("Match found: " + match);
	                    
	                    // Process the match further if needed
	                }
	            }
	            
	            // Close the file
	            bufferedReader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	private void file_folders() {
		
		try {
			  File ff = new File("//home//varadhan//Desktop//banu.txt");
			  FileReader reader = new FileReader(ff);
			 try {
				int r= reader.read();
				while(r!=-1) {
				System.out.print((char)r);
				r=reader.read();
				}}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			} catch (FileNotFoundException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			}
		
		}
	
	
	private void fileendswith() {
	
		File ff=new File("/home//varadhan//Desktop");
		String[]file_folders=ff.list();
		for(int i=0;i<file_folders.length;i++) {
		//	System.out.println(file_folders[i]);
			String st=file_folders[i];
			if(st.endsWith(".pdf")&&st.contains("varadhan")) {
				System.out.println(st);
			}
		}
		
		
	}

	private void learn_file() {
	
		File ff=new File("/home//varadhan//Desktop");
		String[]file_folders=ff.list();
		for(int i=0;i<file_folders.length;i++) {
		//	System.out.println(file_folders[i]);
			String st=file_folders[i];
		
			if(st.equals("banu.txt")){
				System.out.println("yes present");
				 
			}else {
				System.out.println("not present");
			}
			
		}
		
		/*
		 * try { FileWriter writer=new FileWriter(ff,true); BufferedWriter bufwriter=new
		 * BufferedWriter(writer); bufwriter.append("Suriya"); bufwriter.append("SK");
		 * bufwriter.newLine(); bufwriter.append("Suriya"); bufwriter.append("Suriya");
		 * 
		 * bufwriter.flush(); bufwriter.close();
		 * 
		 * 
		 * writer.close(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	//	System.out.println(ff.exists());
		/*
		 * try { ff.createNewFile(); ff.exists(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		
	}

}
