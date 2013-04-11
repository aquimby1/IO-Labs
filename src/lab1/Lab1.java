/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aquimby1
 */
public class Lab1 {
    public static void main(String[] args) throws IOException {
        boolean append = true;
        int recordWanted=2;
        
	File data = new File(File.separatorChar + "JAVA" + File.separatorChar 
                        + "temp"+File.separatorChar + "people.txt");					
						
        
        
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data,append)));
//        
//        out.print("\ndaveson|mike|483 a street|delafield|wi|53018|mdaveson@mail.com|159-159-1596");
//	out.close();
//        
        
        BufferedReader in = null;
            try {
               in = new BufferedReader(new FileReader(data));
               String line = in.readLine();
               int lineNum=0;
               while(line != null){
                   lineNum++;
                   String[] parts = line.split("\\|");
//                   System.out.println("First Name: "+parts[1]);
//                   System.out.println("Last Name: "+parts[0]);
//                   System.out.println("Address: "+parts[2]);
//                   System.out.println(parts[3]+", "+parts[4]+" "+parts[5]);   
//                   System.out.println("Email: "+parts[6]);
//                   System.out.println("Phone: "+parts[7]+"\n");
                   
//                   if(lineNum==recordWanted){
//                       String[] parts = line.split("\\|");
//                   System.out.println("First Name: "+parts[1]);
//                   System.out.println("Last Name: "+parts[0]);
//                   System.out.println("Address: "+parts[2]);
//                   System.out.println(parts[3]+" "+parts[4]+" "+parts[5]);   
//                   System.out.println("Email: "+parts[6]);
//                   System.out.println("Phone: "+parts[7]+"\n");
//                   }
                   
                   System.out.println("The city of record number "+lineNum+" is "+parts[3]);
                   
                   
                   
                      line = in.readLine();  // strips out any carriage return chars
               }

            } catch(IOException ioe) {
                System.out.println("Houston, we have a problem! reading this file");
            } finally {
                try {
                    in.close();
                } catch(Exception e) {

                }
            }
        
            
        
        
        
        
        
    }
    
}
