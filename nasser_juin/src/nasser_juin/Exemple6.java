package nasser_juin;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Exemple6 {

	public static void main(String[] args) 
	{
		String Fichier="Ecrire.txt";
		final String s1 = "bonc ce que je voudrais";
		final String s2= " ecrire et vous faire comprendre";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		
		try {
			ficAEcrire = new FileWriter(Fichier);
			sortie= new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
		} catch (Exception ioe) {
			System.out.println("Erreur entree/sortie");
		}
		
		

	}

}
