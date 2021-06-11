package nasser_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excercise2 {

	public static void main(String[] args)  throws IOException, FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c;
		
		ficALire=new FileReader("monFichier.txt");
		entree = new BufferedReader(ficALire);
		c=(char) entree.read();
		
		while(c !=-1 && c!= '\n')
		{
			System.out.print((char) c);
			c=entree.read();
		}
		
		entree.close();
		ficALire.close();

	}

}