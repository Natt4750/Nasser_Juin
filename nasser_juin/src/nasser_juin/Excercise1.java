package nasser_juin;

import java.io.*;
import java.util.*;
public class Excercise1 

{

    
	public static void main(String[] args) throws IOException 
	
	{
        FileReader ficALire = new FileReader ("monFichier.txt"); 
         BufferedReader entree = new BufferedReader (ficALire); 
         
         int total = 0;
         String line;
         char find = 'a';
         
			 
         
				 while (true) 
				 {
			            line = entree.readLine();
			            
			            if(line == null) 
			            {
			                break;
			            } 
			             
			            	
			            for(char character : line.toCharArray())
			            { 
					            	if(character == find) 
					            {
					                total = total+1;

					            }
									

			            }

			        }
				 System.out.println(total);

         
        
    }
	


}
