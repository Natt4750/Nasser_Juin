package nasser_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excercise2 {

public static void main(String[] args) throws IOException 
	
	{
        FileReader ficALire = new FileReader ("monCalcul.txt"); 
         BufferedReader entree = new BufferedReader (ficALire); 
         
         int total = 0;
         String line;
         
			 
         
				 while (true) 
				 {
			            line = entree.readLine();
			            
			            if(line == null) 
			            {
			                break;
			            } 
			             
			            	
			            for(char character : line.toCharArray())
			            { 
					            	
					                total = total+character;

					            
									

			            }

			        }
				 String Fichier="monResultat.txt";
					final String s1 = String.valueOf(total);
					
					FileWriter writer;
					PrintWriter sortie;
					
					try {
						writer = new FileWriter(Fichier);
						sortie= new PrintWriter(writer);
						sortie.print(s1);
						sortie.close();
					} catch (Exception ioe) {
						System.out.println("Erreur entree/sortie");
					}
         
        
    }
	




}