package namakal1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        
        String inputFilePath = "//home//varadhan//Desktop//varadhanresume.txt";
        
        String outputFilePath = "//home//varadhan//Desktop//phonenumbers.txt";
        
        try {
           
            FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            Pattern p= Pattern.compile("[6-9][0-9]{9}");//patternsyantaxexception-unchecked exception-if anything wrong pattern that exception handled.
            FileWriter fileWriter=new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            
         
            while ((line = bufferedReader.readLine()) != null) {
                Matcher m=p.matcher(line);
                
              
                while (m.find()) {
                    String phonenumber=m.group(); 
                    bufferedWriter.write(phonenumber);
                    
                }
            }
            
          
            bufferedReader.close();
            bufferedWriter.close();
            
            System.out.println("saved to"+ outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
