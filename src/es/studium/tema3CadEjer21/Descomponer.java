package es.studium.tema3CadEjer21;
/*
 * Descomponer - Realizar un programa que lea una cadena y la descomponga en palabras mostrando cada una en una línea diferente.
 */
import java.util.Scanner;
public class Descomponer 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase,subfrase="";
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		teclado.close();
		//Recorre la frase para sacar los caracteres
		for (int i= 0;i<frase.length();i++)
		{
			//si encuentra un caracter lo mete en frase
			if (frase.charAt(i)!=' ')
			{
				subfrase+=frase.charAt(i);
			}
			else
			{
				System.out.println(subfrase);
				subfrase="";
			}
		}
		System.out.print(subfrase);
	}
}