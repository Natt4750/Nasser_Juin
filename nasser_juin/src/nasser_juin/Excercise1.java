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
         char find = 'A';

			 
         
				 while (true) 
				 {
			            line = entree.readLine();
			            if(line == null) 
			            {
			                break;
			            } 
			            else 
			            	if(line.equals(find)) 
			            {
			                total = total+1;
			            }
			        }
			 
			  
         
         System.out.println(total);
        
    }
	
	


}
